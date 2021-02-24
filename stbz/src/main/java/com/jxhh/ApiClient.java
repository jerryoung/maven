package com.jxhh;

import com.google.gson.Gson;
import com.jxhh.exception.ApiRequestException;
import com.jxhh.exception.MustParamsException;
import com.jxhh.res.ApiResultArray;
import com.jxhh.res.ApiResultList;
import com.jxhh.res.ApiResultObject;
import com.jxhh.util.MD5Utils;
import com.jxhh.util.Sha1Utils;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;


public class ApiClient {

	private String appKey;
	
	private String appSecret;
	
	private static final String apiUrl = "https://api.jxhh.com";
	
	private boolean debug = false;
	
	public boolean isDebug() {
		return debug;
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	public ApiClient(String appKey,String appSecret) throws MustParamsException {
		
		if(appKey == null || appKey.equals("")) throw new MustParamsException("对象ApiClient: appKey不能为空");
		if(appSecret == null || appSecret.equals("")) throw new MustParamsException("对象ApiClient: appSecret不能为空");
		this.appKey = appKey;
		this.appSecret = appSecret;
		
	}
	
	private String sign(TreeMap<String, Object> params,String json){
		
		String signStr = new String();
		for(String key : params.keySet()) {
			signStr = signStr + key + params.get(key);
		}

		signStr = signStr + appSecret + json;
		signStr = signStr.replaceAll("\\s*", "");
//		System.out.println(signStr);
		String sha1Str = Sha1Utils.getSha1(signStr);
		String md5Str = MD5Utils.stringToMD5(sha1Str);
		return md5Str.toUpperCase();
		
	}
	
	
	private TreeMap<String, Object> getMustParams(){
		
		TreeMap<String, Object> params = new TreeMap<String,Object>();
		params.put("Api-App-Key", appKey);
		params.put("Api-Time-Stamp", System.currentTimeMillis()+"");
		final double d = Math.random();
		final long i = (long)(System.currentTimeMillis()*d);
		params.put("Api-Nonce", MD5Utils.stringToMD5(appKey+i));
		return params;
		
	}
	
	private String getUrlParams(Map<String, Object> mapUrl) {

		if(0 == mapUrl.size()) return "";
		String urlParams = "?";
		for (String key : mapUrl.keySet()) {
			urlParams += key + "=" + mapUrl.get(key) + "&";
		}
		if(urlParams.length() > 2)urlParams = urlParams.substring(0, urlParams.length()-1);
		return urlParams;
	}
	 	
	
	private TreeMap<String, String> getHeaders(TreeMap<String, Object>mustParams){
		
		TreeMap<String, String> headerMap = new TreeMap<String, String>();
        for (String key : mustParams.keySet()) {
        	String value = (String)mustParams.get(key);
        	headerMap.put(key, value);
		}
        
		return headerMap;
		
	}
	
	
	
	private TreeMap<String, Object> trimParams(TreeMap<String, Object> params){
		
	    for (String key : params.keySet()) {
	    	if(params.get(key) instanceof String) {
	    		params.put(key, ((String)params.get(key)).trim());
	    	}
		}
		return params;
	} 
	
	
//	public ApiResponse exec(InterFaceRequest request) throws MustParamsException, ClientProtocolException, IOException, ApiRequestException {
//
//		TreeMap<String,Object> params = request.getParams();
//		params = trimParams(params);
//		String url = apiUrl  + request.getUrl();
//		InterFaceRequest.RequestMethod method = request.getMethed();
//		Gson gson = new Gson();
//		String jsonBody = gson.toJson(params);
//		if(this.debug) System.err.println("接口请求地址: "+url);
//
//		if(this.debug) System.err.println("接口请求参数: "+jsonBody);
//		TreeMap<String,Object> mustParams = getMustParams();
//
//		String result = "";
//		switch (method) {
//			case GET:
//				url += getUrlParams(params);
//				params.putAll(mustParams);
//				mustParams.put("Api-Sign", sign(params,""));
//				if(this.debug) System.err.println("接口请求Header: "+gson.toJson(getHeaders(mustParams)));
//				result = HttpClient.get(url, getHeaders(mustParams));
//			break;
//			case GETBODY:
//				mustParams.put("Api-Sign", sign(mustParams,jsonBody));
//				if(this.debug) System.err.println("接口请求Header: "+gson.toJson(getHeaders(mustParams)));
//				result = HttpClient.get(url, jsonBody, getHeaders(mustParams));
//				break;
//			case POST:
//				mustParams.put("Api-Sign", sign(mustParams,jsonBody));
//				if(this.debug) System.err.println("接口请求Header: "+gson.toJson(getHeaders(mustParams)));
//				result = HttpClient.post(url, jsonBody, getHeaders(mustParams));
//				break;
//			case PATCH:
//				mustParams.put("Api-Sign", sign(mustParams,jsonBody));
//				if(this.debug) System.err.println("接口请求Header: "+gson.toJson(getHeaders(mustParams)));
//				result = HttpClient.patch(url, jsonBody, getHeaders(mustParams));
//				break;
//			default:
//				break;
//		}
//
//		if(this.debug) System.err.println("接口返回数据： "+result);
//		if(result.equals("")) throw new ApiRequestException("Api请求失败");
//		ApiResponse apiResponse = new ApiResponse();
//		apiResponse.setResultString(result);
//		if(1 == request.getResponseType()){ //列表
//			ApiResultList apiResultList = gson.fromJson(result, request.getJsonClassType());
//			apiResponse.setTotal(apiResultList.getData().getTotal());
//			apiResponse.setCode(apiResultList.getCode());
//			apiResponse.setMsg(apiResultList.getMsg());
//			if(1 == apiResultList.getCode()){
//				apiResponse.setCount(apiResultList.getData().getCount());
//				apiResponse.setLists(apiResultList.getData().getList());
//				if(null == apiResultList.getData().getList()){
//					apiResponse.setLists(apiResultList.getData().getData());
//				}
//			}
//		}else if(0 == request.getResponseType()){ //对象
//			ApiResultObject apiResultObject = gson.fromJson(result, request.getJsonClassType());
//			apiResponse.setCode(apiResultObject.getCode());
//			apiResponse.setMsg(apiResultObject.getMsg());
//			if(1 == apiResultObject.getCode()){
//				apiResponse.setObject(apiResultObject.getData());
//			}
//		}else if(2 == request.getResponseType()){ //数组
//
//			ApiResultArray apiResultArray = gson.fromJson(result, request.getJsonClassType());
//			apiResponse.setCode(apiResultArray.getCode());
//			apiResponse.setMsg(apiResultArray.getMsg());
//			if(1 == apiResultArray.getCode()){
//				apiResponse.setLists(apiResultArray.getData());
//			}
//
//		}else{
//			apiResponse.setObject(gson.fromJson(result, request.getJsonClassType()));
//		}
//		return apiResponse;
//
//	}


	public ApiResponse exec(InterFaceRequest request) throws MustParamsException, IOException, ApiRequestException {

		TreeMap<String,Object> params = request.getParams();
		params = trimParams(params);
		String url = apiUrl  + request.getUrl();
		InterFaceRequest.RequestMethod method = request.getMethed();
		Gson gson = new Gson();
		String jsonBody = gson.toJson(params);
		if(this.debug) System.err.println("接口请求地址: "+url);

		if(this.debug) System.err.println("接口请求参数: "+jsonBody);
		TreeMap<String,Object> mustParams = getMustParams();

		String result = "";
		switch (method) {
			case GET:
				url += getUrlParams(params);
				params.putAll(mustParams);
				mustParams.put("Api-Sign", sign(params,""));
				if(this.debug) System.err.println("接口请求Header: "+gson.toJson(getHeaders(mustParams)));
				result = HttpClient.get(url, getHeaders(mustParams));
				break;
			case GETBODY:
				mustParams.put("Api-Sign", sign(mustParams,jsonBody));
				if(this.debug) System.err.println("接口请求Header: "+gson.toJson(getHeaders(mustParams)));
				result = HttpClient.get(url, jsonBody, getHeaders(mustParams));
				break;
			case POST:
				mustParams.put("Api-Sign", sign(mustParams,jsonBody));
				if(this.debug) System.err.println("接口请求Header: "+gson.toJson(getHeaders(mustParams)));
				result = HttpClient.post(url, jsonBody, getHeaders(mustParams));
				break;
			case PATCH:
				mustParams.put("Api-Sign", sign(mustParams,jsonBody));
				if(this.debug) System.err.println("接口请求Header: "+gson.toJson(getHeaders(mustParams)));
				result = HttpClient.patch(url, jsonBody, getHeaders(mustParams));
				break;
			default:
				break;
		}

		if(this.debug) System.err.println("接口返回数据： "+result);
		if(result.equals("")) throw new ApiRequestException("Api请求失败");

		if(1 == request.getResponseType()){ //列表
			ApiResultList apiResultList = gson.fromJson(result, request.getJsonClassType());
			if(1 == apiResultList.getCode()){
				if(null == apiResultList.getData().getList()){
					return ApiResponse.create().setTotal(apiResultList.getData().getTotal()).setCount(apiResultList.getData().getCount()).setCode(apiResultList.getCode())
							.setMsg(apiResultList.getMsg()).setLists(apiResultList.getData().getData()).setResultString(result);
				}
				return ApiResponse.create().setTotal(apiResultList.getData().getTotal()).setCount(apiResultList.getData().getCount()).setCode(apiResultList.getCode())
						.setMsg(apiResultList.getMsg()).setLists(apiResultList.getData().getList()).setResultString(result);
			}
			return ApiResponse.create().setCode(apiResultList.getCode()).setMsg(apiResultList.getMsg()).setResultString(result);
		}else if(0 == request.getResponseType()){ //对象
			ApiResultObject apiResultObject = gson.fromJson(result, request.getJsonClassType());
			if(1 == apiResultObject.getCode()){
				return ApiResponse.create().setCode(apiResultObject.getCode()).setMsg(apiResultObject.getMsg()).setObject(apiResultObject.getData()).setResultString(result);
			}
			return ApiResponse.create().setCode(apiResultObject.getCode()).setMsg(apiResultObject.getMsg()).setResultString(result);
		}else if(2 == request.getResponseType()){ //数组

			ApiResultArray apiResultArray = gson.fromJson(result, request.getJsonClassType());
			if(1 == apiResultArray.getCode()){
				return ApiResponse.create().setCode(apiResultArray.getCode()).setMsg(apiResultArray.getMsg()).setLists(apiResultArray.getData()).setResultString(result);
			}
			return ApiResponse.create().setCode(apiResultArray.getCode()).setMsg(apiResultArray.getMsg()).setResultString(result);
		}else{
			return ApiResponse.create().setObject(gson.fromJson(result, request.getJsonClassType())).setResultString(result);
		}

	}


}
