package com.jxhh.afterService;

import com.google.gson.reflect.TypeToken;
import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;
import com.jxhh.res.ApiResultList;

import java.lang.reflect.Type;
import java.util.TreeMap;

/**
 *
 * 售后列表请求
 *
 */
public class AfterServiceListRequest implements InterFaceRequest {

    /**
     * page	是	1	页码，从1开始
     * limit	是	10	每页数据条数，1-100
     * orderSn	否	ME20191126220022744654	三方订单号
     * sku	否	433522	商品规格ID。
     * @return
     */

    private Integer page;

    private Integer Limit;

    private String orderSn;

    private Long sku;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return Limit;
    }

    public void setLimit(Integer limit) {
        Limit = limit;
    }

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

    @Override
    public RequestMethod getMethed() {
        return RequestMethod.GET;
    }

    @Override
    public String getUrl() {

        return "/v2/afterSale";

    }

    @Override
    public TreeMap<String, Object> getParams() throws MustParamsException {

        if(null == getPage()) throw new MustParamsException("对象"+getClass()+": page不能为空");
        if(null == getLimit()) throw new MustParamsException("对象"+getClass()+": limit不能为空");

        TreeMap<String,Object> params = new TreeMap<>();
        params.put("page",getPage());
        params.put("limit",getLimit());
        if(null != getOrderSn()) params.put("orderSn",getOrderSn());
        if(null != getSku()) params.put("sku",getSku());
        return params;

    }

    @Override
    public Integer getResponseType() {
        return 1;
    }

    @Override
    public Type getJsonClassType() {
        return new TypeToken<ApiResultList<AfterServiceList>>() {}.getType();
    }


}
