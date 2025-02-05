package com.jxhh.goods;

import com.google.gson.reflect.TypeToken;
import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;
import com.jxhh.res.ApiResultList;

import java.lang.reflect.Type;
import java.util.TreeMap;

public class GoodsGroupListRequest implements InterFaceRequest {

    private Integer page;

    private Integer limit;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public RequestMethod getMethed() {
        return RequestMethod.GET;
    }

    @Override
    public String getUrl() {
        return "/v2/GoodsGroup/ApiLists";
    }

    @Override
    public TreeMap<String, Object> getParams() throws MustParamsException {

        TreeMap<String, Object> paramsMap = new TreeMap<String, Object>();

        if(null == getPage()) throw new MustParamsException("对象"+getClass()+": page不能为空");
        if(null == getLimit()) throw new MustParamsException("对象"+getClass()+": limit不能为空");
        paramsMap.put("page", getPage());
        paramsMap.put("limit", getLimit());

        return paramsMap;
    }

    @Override
    public Integer getResponseType() {
        return 1;
    }

    @Override
    public Type getJsonClassType() {
        return new TypeToken<ApiResultList<GoodsGroupList>>() {}.getType();
    }
}
