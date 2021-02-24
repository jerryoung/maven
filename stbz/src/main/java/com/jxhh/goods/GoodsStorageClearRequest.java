package com.jxhh.goods;

import com.google.gson.reflect.TypeToken;
import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;
import com.jxhh.res.ApiResultObject;

import java.lang.reflect.Type;
import java.util.TreeMap;


/**
 *  清空选品库所有商品请求类
 *  谨慎使用，清空后会导致所有商品无法接收到消息通知
 *
 */
public class GoodsStorageClearRequest implements InterFaceRequest {


    @Override
    public RequestMethod getMethed() {
        return RequestMethod.GET;
    }

    @Override
    public String getUrl() {
        return "/v2/GoodsStorage/Delete";
    }

    @Override
    public TreeMap<String, Object> getParams() throws MustParamsException {
        TreeMap<String,Object> params = new TreeMap<>();
        return params;
    }

    @Override
    public Integer getResponseType() {
        return 0;
    }

    @Override
    public Type getJsonClassType() {
        return new TypeToken<ApiResultObject>() {}.getType();
    }
}
