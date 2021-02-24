package com.jxhh.order;

import com.google.gson.reflect.TypeToken;
import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;
import com.jxhh.res.ApiResultObject;

import java.lang.reflect.Type;
import java.util.TreeMap;

/**
 *
 * 订单详情请求类
 */
public class OrderDetailRequest implements InterFaceRequest {


    private String sn;

    public String getSn() {
        return sn;
    }

    /**
     * 设置三级订单号
     * @param sn
     */
    public void setSn(String sn) {
        this.sn = sn;
    }

    @Override
    public RequestMethod getMethed() {
        return RequestMethod.GET;
    }

    @Override
    public String getUrl() {
        return "/v2/order/"+getSn();
    }

    @Override
    public TreeMap<String, Object> getParams() throws MustParamsException {
        TreeMap<String, Object> params = new TreeMap<String, Object>();
        if(null == getSn()) throw new MustParamsException("对象"+getClass()+": sn不能为空");
        return params;
    }

    @Override
    public Integer getResponseType() {
        return 0;
    }

    @Override
    public Type getJsonClassType() {
        return new TypeToken<ApiResultObject<OrderDetail>>() {}.getType();
    }
}
