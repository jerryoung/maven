package com.jxhh.order;

import com.google.gson.reflect.TypeToken;
import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;
import com.jxhh.res.ApiResultList;

import java.lang.reflect.Type;
import java.util.TreeMap;

public class SubOrderListRequest implements InterFaceRequest {

    private Integer limit;

    private Integer page;

    private Integer source;



    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }


    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    @Override
    public RequestMethod getMethed() {
        return RequestMethod.GET;
    }

    @Override
    public String getUrl() {
        return "/v2/order/source/"+getSource();
    }

    @Override
    public TreeMap<String, Object> getParams() throws MustParamsException {

        TreeMap<String,Object> params = new TreeMap<>();
        if(null == getSource()) throw new MustParamsException("对象"+getClass()+": source不能为空");
        if(null == getPage()) throw new MustParamsException("对象"+getClass()+": page不能为空");
        if(null == getLimit()) throw new MustParamsException("对象"+getClass()+": limit不能为空");
        params.put("source",getSource());
        params.put("page",getPage());
        params.put("limit",getLimit());
        return params;
    }

    @Override
    public Integer getResponseType() {
        return 1;
    }

    @Override
    public Type getJsonClassType() {
        return new TypeToken<ApiResultList<SubOrderList>>() {}.getType();
    }
}
