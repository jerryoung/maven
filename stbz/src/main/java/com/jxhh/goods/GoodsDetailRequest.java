package com.jxhh.goods;

import com.google.gson.reflect.TypeToken;
import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;
import com.jxhh.res.ApiResultObject;

import java.lang.reflect.Type;
import java.util.TreeMap;


/**
 * 商品详情请求类
 * @author Administrator
 *
 */
public class GoodsDetailRequest implements InterFaceRequest {

	private Long id;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public RequestMethod getMethed() {
		return RequestMethod.GET;
	}

	@Override
	public String getUrl() {
		return "/v2/Goods/Detail";
	}

	@Override
	public TreeMap<String, Object> getParams() throws MustParamsException {

		if(null == getId()) throw new MustParamsException("对象GoodsDetail: id不能为空");
		TreeMap<String, Object> params = new TreeMap<String,Object>();
		params.put("id", getId());
		return params;
	}

	@Override
	public Integer getResponseType() {
		return 0;
	}

	@Override
	public Type getJsonClassType() {
		return new TypeToken<ApiResultObject<GoodsDetail>>() {}.getType();
	}


}
