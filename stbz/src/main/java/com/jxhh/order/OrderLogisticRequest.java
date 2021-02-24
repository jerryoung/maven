package com.jxhh.order;

import com.google.gson.reflect.TypeToken;
import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;
import com.jxhh.res.ApiResultObject;

import java.lang.reflect.Type;
import java.util.TreeMap;

/**
 * 获取物流信息请求类
 *
 */
public class OrderLogisticRequest implements InterFaceRequest {

    private String orderSn;

    private Long sku;

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Long getSku() {
        return sku;
    }

    public void setSku(Long sku) {
        this.sku = sku;
    }

    @Override
    public RequestMethod getMethed() {
        return RequestMethod.GET;
    }

    @Override
    public String getUrl() {
        return "/v2/logistic";
    }

    @Override
    public TreeMap<String, Object> getParams() throws MustParamsException {

        TreeMap<String,Object> params = new TreeMap<>();
        if(null == getOrderSn()) throw new MustParamsException("对象"+getClass()+": orderSn不能为空");
        if(null == getSku()) throw new MustParamsException("对象"+getClass()+": sku不能为空");
        params.put("orderSn",getOrderSn());
        params.put("sku",getSku());
        return params;
    }

    @Override
    public Integer getResponseType() {
        return 0;
    }

    @Override
    public Type getJsonClassType() {
        return new TypeToken<ApiResultObject<OrderLogistic>>() {}.getType();
    }
}
