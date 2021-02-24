package com.jxhh.goods;

import com.google.gson.reflect.TypeToken;
import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;
import com.jxhh.res.ApiResultArray;

import java.lang.reflect.Type;
import java.util.TreeMap;

/**
 * 批量新商品
 *
 */
public class BatchGoodsUpdateRequest implements InterFaceRequest {


    private String goodsIds;

    public String getGoodsIds() {
        return goodsIds;
    }

    public void setGoodsIds(String goodsIds) {
        this.goodsIds = goodsIds;
    }

    @Override
    public RequestMethod getMethed() {
        return RequestMethod.POST;
    }

    @Override
    public String getUrl() {
        return "/v2/Goods/GetBulkGoodsMessage";
    }

    @Override
    public TreeMap<String, Object> getParams() throws MustParamsException {

        if(null == getGoodsIds()) throw new MustParamsException("对象"+getClass()+": goodsIds不能为空");
        TreeMap<String, Object> params = new TreeMap<String, Object>();
        params.put("goodsIds",getGoodsIds());
        return params;

    }

    @Override
    public Integer getResponseType() {
        return 2;
    }

    @Override
    public Type getJsonClassType() {
        return new TypeToken<ApiResultArray<String>>() {}.getType();
    }
}
