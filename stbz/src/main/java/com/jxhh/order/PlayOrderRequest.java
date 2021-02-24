package com.jxhh.order;

import com.jxhh.exception.MustParamsException;

import java.util.TreeMap;

/**
 * 下单请求类
 */
public class PlayOrderRequest extends CheckOrderRequest{

    private String orderSn;

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    @Override
    public TreeMap<String, Object> getParams() throws MustParamsException {

        if(null == getOrderSn()) throw new MustParamsException("对象"+getClass()+": orderSn不能为空");
        TreeMap<String,Object> params = super.getParams();
        params.put("orderSn",getOrderSn());
        return params;
    }

    @Override
    public String getUrl() {
        return "/v2/order";
    }
}
