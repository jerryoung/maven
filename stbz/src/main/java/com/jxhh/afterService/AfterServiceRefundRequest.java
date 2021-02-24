package com.jxhh.afterService;

import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;

import java.lang.reflect.Type;
import java.util.List;
import java.util.TreeMap;

public class AfterServiceRefundRequest implements InterFaceRequest {

    /**
     *
     * id	number	必须		售后单id
     * sn	string	必须		快递单号
     * company	string	必须		快递公司编号
     * vouchers	string []	非必须		快递凭证，如不传此凭证，无法理赔
     * item 类型: string
     *
     * ├─		非必须
     * description	string	非必须		描述说明
     * @return
     */

    private Long id;

    private String sn;

    private String company;

    private List<String> vouchers;

    private String item;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<String> getVouchers() {
        return vouchers;
    }

    public void setVouchers(List<String> vouchers) {
        this.vouchers = vouchers;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public RequestMethod getMethed() {
        return RequestMethod.PATCH;
    }

    @Override
    public String getUrl() {
        return "/v2/afterSale";
    }

    @Override
    public TreeMap<String, Object> getParams() throws MustParamsException {

        if(null == getId()) throw new MustParamsException("对象"+getClass()+": id不能为空");
        if(null == getSn()) throw new MustParamsException("对象"+getClass()+": sn不能为空");
        if(null == getCompany()) throw new MustParamsException("对象"+getClass()+": company不能为空");

        TreeMap<String,Object> params = new TreeMap<>();
        params.put("id",getId());
        params.put("sn",getSn());
        params.put("company",getCompany());
        if(null != getVouchers()) params.put("vouchers",getVouchers());
        if(null != getItem()) params.put("item",getItem());
        if(null != getDescription()) params.put("description",getDescription());

        return params;

    }

    @Override
    public Integer getResponseType() {
        return 0;
    }

    @Override
    public Type getJsonClassType() {
        return null;
    }



}
