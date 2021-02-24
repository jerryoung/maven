package com.jxhh.order;

import com.google.gson.reflect.TypeToken;
import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;
import com.jxhh.res.ApiResultList;

import java.lang.reflect.Type;
import java.util.TreeMap;

/**
 *
 * 错误订单列表请求
 *
 */
public class OrderErrorListRequest implements InterFaceRequest {
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

    private Integer page;

    private Integer limit;



    @Override
    public RequestMethod getMethed() {
        return RequestMethod.GETBODY;
    }

    @Override
    public String getUrl() {
        return "/v2/order/errorLists";
    }

    @Override
    public TreeMap<String, Object> getParams() throws MustParamsException {

        TreeMap<String, Object> params = new TreeMap<String, Object>();
        if(null == getPage()) throw new MustParamsException("对象"+getClass()+": page不能为空");
        if(null == getLimit()) throw new MustParamsException("对象"+getClass()+": limit不能为空");
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
        return new TypeToken<ApiResultList<OrderErrorList>>() {}.getType();
    }
}
