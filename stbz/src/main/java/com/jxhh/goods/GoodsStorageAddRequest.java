package com.jxhh.goods;

import com.google.gson.reflect.TypeToken;
import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;
import com.jxhh.res.ApiResultObject;

import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeMap;


/**
 *  商品添加进选品库请求类
 */
public class GoodsStorageAddRequest implements InterFaceRequest {

    private Set<Long> goods_ids;

    public Set<Long> getGoods_ids() {
        return goods_ids;
    }

    public void setGoods_ids(Set<Long> goods_ids) {
        this.goods_ids = goods_ids;
    }

    @Override
    public RequestMethod getMethed() {
        return RequestMethod.GET;
    }

    @Override
    public String getUrl() {
        return "/v2/GoodsStorage/Add";
    }

    @Override
    public TreeMap<String, Object> getParams() throws MustParamsException {

        TreeMap<String,Object> params = new TreeMap<String,Object>();

        if(null == getGoods_ids()) throw new MustParamsException("对象"+getClass()+": goods_ids不能为空");

        String goods_ids = "";
        for (Long i:getGoods_ids()) {
            goods_ids = goods_ids+i+",";
        }
        if(goods_ids.length() > 2)goods_ids = goods_ids.substring(0, goods_ids.length()-1);
        params.put("goods_ids",goods_ids);
        return params;
    }

    @Override
    public Integer getResponseType() {
        return 0;
    }

    @Override
    public Type getJsonClassType() {
        return new TypeToken<ApiResultObject<GoodsStorage>>() {}.getType();
    }
}
