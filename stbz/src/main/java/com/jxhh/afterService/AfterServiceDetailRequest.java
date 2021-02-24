package com.jxhh.afterService;

import com.google.gson.reflect.TypeToken;
import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;
import com.jxhh.res.ApiResultObject;

import java.lang.reflect.Type;
import java.util.TreeMap;

/**
 *
 * 售后详情
 */
public class AfterServiceDetailRequest implements InterFaceRequest {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public RequestMethod getMethed() {
        return RequestMethod.GET;
    }

    @Override
    public String getUrl() {
        return "/v2/afterSale/"+getId();
    }

    @Override
    public TreeMap<String, Object> getParams() throws MustParamsException {

        if(null == getId()) throw new MustParamsException("对象"+getClass()+": id不能为空");
        TreeMap<String,Object> params = new TreeMap<>();
        params.put("id",getId());
        return params;
    }

    @Override
    public Integer getResponseType() {
        return 0;
    }

    @Override
    public Type getJsonClassType() {
        return new TypeToken<ApiResultObject<AfterServiceDetail>>() {}.getType();
    }
}
