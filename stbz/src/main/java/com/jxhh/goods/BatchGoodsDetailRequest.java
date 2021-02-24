package com.jxhh.goods;

import com.google.gson.reflect.TypeToken;
import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;
import com.jxhh.res.ApiResultArray;

import java.lang.reflect.Type;
import java.util.TreeMap;

/**
 *
 *批量获取商品详情
 *
 */
public class BatchGoodsDetailRequest implements InterFaceRequest {

    private String ids;

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    @Override
    public RequestMethod getMethed() {
        return RequestMethod.POST;
    }

    @Override
    public String getUrl() {
        return "/v2/Goods/GetBulkGoodDetail";
    }

    @Override
    public TreeMap<String, Object> getParams() throws MustParamsException {

        TreeMap<String,Object> params = new TreeMap<>();
        if(null == getIds()) throw new MustParamsException("对象"+getClass()+": ids不能为空");
        params.put("ids",getIds());
        return params;
    }

    @Override
    public Integer getResponseType() {
        return 2;
    }

    @Override
    public Type getJsonClassType() {
        return new TypeToken<ApiResultArray<GoodsDetail>>() {}.getType();
    }



}
