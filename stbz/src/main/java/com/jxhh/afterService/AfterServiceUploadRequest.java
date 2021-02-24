package com.jxhh.afterService;

import com.google.gson.reflect.TypeToken;
import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;
import com.jxhh.res.ApiResultObject;

import java.lang.reflect.Type;
import java.util.List;
import java.util.TreeMap;

public class AfterServiceUploadRequest implements InterFaceRequest {

    /**
     *
     * orderSn	string	必须		三方订单号
     * sku	number	必须		商品sku
     * pictures	string []	必须		经过base64编码的图片数据，支持同时上传多张图片。
     * 限制：每张图片原始数据（base64之前）不能超过1M。
     * 如果您使用的JavaScript或类似的语言请注意（其他语言请忽略）：需要的是图片base64原始数据，不要描述部分，也就是说，只要逗号（不含）以后的部分
     * item 类型: strin
     *
     * @return
     */

    private String orderSn;

    private Long sku;

    private List<String> pictures;

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

    public List<String> getPictures() {
        return pictures;
    }

    public void setPictures(List<String> pictures) {
        this.pictures = pictures;
    }

    @Override
    public RequestMethod getMethed() {
        return RequestMethod.POST;
    }

    @Override
    public String getUrl() {
        return "/v2/afterSale/picture";
    }

    @Override
    public TreeMap<String, Object> getParams() throws MustParamsException {

        if(null == getOrderSn()) throw new MustParamsException("对象"+getClass()+": orderSn不能为空");
        if(null == getSku()) throw new MustParamsException("对象"+getClass()+": sku不能为空");
        if(null == getPictures()) throw new MustParamsException("对象"+getClass()+": pictures不能为空");

        TreeMap<String,Object> params = new TreeMap<>();
        params.put("orderSn",getOrderSn());
        params.put("sku",getSku());
        params.put("pictures",getPictures());

        return params;

    }

    @Override
    public Integer getResponseType() {
        return 0;
    }

    @Override
    public Type getJsonClassType() {
        return new TypeToken<ApiResultObject<AfterServiceUpload>>() {}.getType();
    }


}
