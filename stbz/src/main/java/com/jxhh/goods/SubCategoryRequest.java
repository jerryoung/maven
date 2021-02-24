package com.jxhh.goods;

import com.google.gson.reflect.TypeToken;
import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;
import com.jxhh.res.ApiResultArray;

import java.lang.reflect.Type;
import java.util.TreeMap;

/**
 *逐级分类接口
 *
 */
public class SubCategoryRequest implements InterFaceRequest {


    private Integer parent_id;

    private Integer source;

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    @Override
    public RequestMethod getMethed() {
        return RequestMethod.GET;
    }

    @Override
    public String getUrl() {
        return "/v2/Category/GetCategory";
    }

    @Override
    public TreeMap<String, Object> getParams() throws MustParamsException {

        if(null == getParent_id()) throw new MustParamsException("对象"+getClass()+": parent_id不能为空");
        if(null == getSource()) throw new MustParamsException("对象"+getClass()+": source不能为空");

        TreeMap<String, Object> params = new TreeMap<String, Object>();
        params.put("parent_id",getParent_id());
        params.put("source",getSource());

        return params;

    }

    @Override
    public Integer getResponseType() {
        return 2;
    }

    @Override
    public Type getJsonClassType() {
        return new TypeToken<ApiResultArray<SubCategory>>() {}.getType();
    }
}
