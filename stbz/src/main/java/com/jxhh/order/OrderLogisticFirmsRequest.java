package com.jxhh.order;

import com.google.gson.reflect.TypeToken;
import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;
import com.jxhh.res.ApiResultArray;

import java.lang.reflect.Type;
import java.util.TreeMap;

/**
 * 物流公司列表
 */
public class OrderLogisticFirmsRequest implements InterFaceRequest {


    @Override
    public RequestMethod getMethed() {
        return RequestMethod.GET;
    }

    @Override
    public String getUrl() {
        return "/v2/logistic/firms";
    }

    @Override
    public TreeMap<String, Object> getParams() throws MustParamsException {
        return new TreeMap<String,Object>();
    }

    @Override
    public Integer getResponseType() {
        return 2;
    }

    @Override
    public Type getJsonClassType() {
        return new TypeToken<ApiResultArray<OrderLogisticFirms>>() {}.getType();
    }
}
