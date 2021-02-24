package com.jxhh.order;

import com.google.gson.reflect.TypeToken;
import com.jxhh.res.ApiResultObject;

import java.lang.reflect.Type;

/**
 *
 * 可售性校验
 */
public class CheckBanGoodsRequest extends CheckOrderRequest{

    @Override
    public String getUrl() {
        return "/v2/order/availableCheck";
    }

    @Override
    public RequestMethod getMethed() {
        return RequestMethod.GETBODY;
    }

    @Override
    public Type getJsonClassType() {
        return new TypeToken<ApiResultObject<CheckBanGoods>>() {}.getType();
    }

    @Override
    public Integer getResponseType() {
        return 0;
    }


}
