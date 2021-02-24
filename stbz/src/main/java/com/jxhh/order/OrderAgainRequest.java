package com.jxhh.order;

import com.google.gson.reflect.TypeToken;
import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;
import com.jxhh.res.ApiResultObject;

import java.lang.reflect.Type;
import java.util.TreeMap;

/**
 *
 * 失败补单接口
 *
 */
public class OrderAgainRequest implements InterFaceRequest {

    private String orderSn;

    public String getOrderSn() {
        return orderSn;
    }

    /**
     * 设置二级订单号 失败订单的订单号
     * @param orderSn
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    @Override
    public RequestMethod getMethed() {
        return RequestMethod.PATCH;
    }

    @Override
    public String getUrl() {
        return "/v2/order";
    }

    @Override
    public TreeMap<String, Object> getParams() throws MustParamsException {
        TreeMap<String, Object> params = new TreeMap<>();
        if(null == getOrderSn()) throw new MustParamsException("对象"+getClass()+": orderSn不能为空");
        params.put("orderSn",getOrderSn());
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
