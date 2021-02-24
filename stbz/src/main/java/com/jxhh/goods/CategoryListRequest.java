package com.jxhh.goods;

import com.google.gson.reflect.TypeToken;
import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;
import com.jxhh.res.ApiResultList;

import java.lang.reflect.Type;
import java.util.TreeMap;

public class CategoryListRequest implements InterFaceRequest {

    private Integer page;

    private Integer limit;

    private Integer source;

    public Integer getPage() {
        return page;
    }

    /**
     * 设置页码
     * @param page
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }


    /**
     * 设置分页条数
     * 最多不超过500条
     * @param limit
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getSource() {
        return source;
    }


    /**
     * 设置来源
     * 0 全部
     * 1 云仓
     * 2 京东
     * 6 阿里
     * 7 天猫
     * @param source
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    @Override
    public RequestMethod getMethed() {
        return RequestMethod.GET;
    }

    @Override
    public String getUrl() {
        return "/v2/Category/Lists";
    }

    @Override
    public TreeMap<String, Object> getParams() throws MustParamsException {

        TreeMap<String,Object> params = new TreeMap<>();
        if(null == getPage()) throw new MustParamsException("对象GoodsList: page不能为空");
        if(null == getLimit()) throw new MustParamsException("对象GoodsList: limit不能为空");
        if(null == getSource()) throw new MustParamsException("对象GoodsList: source不能为空");
        params.put("page", getPage());
        params.put("limit", getLimit());
        params.put("source", getSource());
        return params;
    }

    @Override
    public Integer getResponseType() {
        return 1;
    }

    @Override
    public Type getJsonClassType() {
        return new TypeToken<ApiResultList<CategoryList>>() {}.getType();
    }



}
