package com.jxhh;

import com.jxhh.exception.MustParamsException;

import java.lang.reflect.Type;
import java.util.TreeMap;

/**
 * 接口请求通用接口
 */
public interface InterFaceRequest {

	public static enum RequestMethod {
		GET,GETBODY,HEAD, POST,PUT, PATCH, DELETE, OPTIONS, TRACE
	}
	
	public RequestMethod getMethed();
	
	public String getUrl();
	
	public TreeMap<String, Object> getParams() throws MustParamsException;

	/**
	 * 0为基础类型 1为列表
	 * @return
	 */
	public Integer getResponseType();

	/**
	 * 转Json处理泛型
	 * @return
	 */
	public Type getJsonClassType();

}
