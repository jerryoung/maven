package com.jxhh.goods;

import com.google.gson.reflect.TypeToken;
import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;
import com.jxhh.res.ApiResultList;

import java.lang.reflect.Type;
import java.util.List;
import java.util.TreeMap;

public class GoodsStorageOnlineListRequest implements InterFaceRequest {


    /**
     * page	number	必须		页码
     * limit	number	必须		条数
     * source	number	非必须		平台来源1云仓2京东6阿里巴巴7天猫
     * category_id	number
     *
     * type	string	非必须		排序类型agreement_price协议价，guide_price指导价，activity_price营销价，promotion_rate常规利润率，activity_rate营销利润率。created_time最新上架,real_month_sale本月销量
     * sort	string	非必须		desc倒序asc正序
     * is_free_shipping	number	非必须		0不包邮1包邮-1全部
     * shop_words	string	非必须		店铺id店铺名称
     * group_id	number	非必须		营销活动id
     *
     * @return
     */

    private Integer page;

    private Integer limit;

    private Integer source;

    private Integer category_id;

    private List<Integer> brand_ids;

    private String type;

    private String sort;

    private Integer is_free_shipping;

    private String shop_words;

    private Integer group_id;

    private Section agreement_price;

    private Section guide_price;

    private Section activity_price;

    private Section promote_rate;

    private Section activity_rate;

    private Section profits;

    private Section created_time;

    public Section getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Section created_time) {
        this.created_time = created_time;
    }

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

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public List<Integer> getBrand_ids() {
        return brand_ids;
    }

    public void setBrand_ids(List<Integer> brand_ids) {
        this.brand_ids = brand_ids;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Integer getIs_free_shipping() {
        return is_free_shipping;
    }

    public void setIs_free_shipping(Integer is_free_shipping) {
        this.is_free_shipping = is_free_shipping;
    }

    public String getShop_words() {
        return shop_words;
    }

    public void setShop_words(String shop_words) {
        this.shop_words = shop_words;
    }

    public Integer getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
    }

    public Section getAgreement_price() {
        return agreement_price;
    }

    public void setAgreement_price(Section agreement_price) {
        this.agreement_price = agreement_price;
    }

    public Section getGuide_price() {
        return guide_price;
    }

    public void setGuide_price(Section guide_price) {
        this.guide_price = guide_price;
    }

    public Section getActivity_price() {
        return activity_price;
    }

    public void setActivity_price(Section activity_price) {
        this.activity_price = activity_price;
    }

    public Section getPromote_rate() {
        return promote_rate;
    }

    public void setPromote_rate(Section promote_rate) {
        this.promote_rate = promote_rate;
    }

    public Section getActivity_rate() {
        return activity_rate;
    }

    public void setActivity_rate(Section activity_rate) {
        this.activity_rate = activity_rate;
    }

    public Section getProfits() {
        return profits;
    }

    public void setProfits(Section profits) {
        this.profits = profits;
    }

    public static class Section{

        private Integer from;

        private Integer to;

        public Integer getFrom() {
            return from;
        }

        public void setFrom(Integer from) {
            this.from = from;
        }

        public Integer getTo() {
            return to;
        }

        public void setTo(Integer to) {
            this.to = to;
        }
    }

    @Override
    public RequestMethod getMethed() {
        return RequestMethod.POST;
    }

    @Override
    public String getUrl() {
        return "/v2/GoodsStorage/NewList";
    }

    @Override
    public TreeMap<String, Object> getParams() throws MustParamsException {

        TreeMap<String,Object> paramsMap = new TreeMap<String,Object>();

        if(null == getPage()) throw new MustParamsException("对象"+getClass()+": page不能为空");
        if(null == getLimit()) throw new MustParamsException("对象"+getClass()+": limit不能为空");
        paramsMap.put("page", getPage());
        paramsMap.put("limit", getLimit());

        if(null != getSource()) paramsMap.put("source", getSource());
        if(null != getCategory_id()) paramsMap.put("category_id", getCategory_id());
        if(null != getBrand_ids()) paramsMap.put("brand_ids", getBrand_ids());
        if(null != getAgreement_price()) paramsMap.put("agreement_price", getAgreement_price());
        if(null != getGuide_price()) paramsMap.put("guide_price", getGuide_price());
        if(null != getActivity_price()) paramsMap.put("activity_price", getActivity_price());
        if(null != getPromote_rate()) paramsMap.put("promote_rate", getPromote_rate());
        if(null != getActivity_rate()) paramsMap.put("activity_rate", getActivity_rate());
        if(null != getProfits()) paramsMap.put("profits", getProfits());
        if(null != getType()) paramsMap.put("type", getType());
        if(null != getSort()) paramsMap.put("sort", getSort());
        if(null != getIs_free_shipping()) paramsMap.put("is_free_shipping", getIs_free_shipping());
        if(null != getShop_words()) paramsMap.put("shop_words", getShop_words());
        if(null != getGroup_id()) paramsMap.put("group_id", getGroup_id());
        if(null != getCreated_time()) paramsMap.put("created_time",getCreated_time());

        return paramsMap;
    }

    @Override
    public Integer getResponseType() {
        return 1;
    }

    @Override
    public Type getJsonClassType() {
        return new TypeToken<ApiResultList<GoodsStorageOnlineList>>() {}.getType();
    }
}
