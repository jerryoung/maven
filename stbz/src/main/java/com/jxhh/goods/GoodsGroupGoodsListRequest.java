package com.jxhh.goods;

import com.google.gson.reflect.TypeToken;
import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;
import com.jxhh.res.ApiResultList;

import java.lang.reflect.Type;
import java.util.TreeMap;

public class GoodsGroupGoodsListRequest implements InterFaceRequest {

    private Integer page;

    private Integer limit;

    private Integer source;

    private Integer group_id;

    private Integer is_free_shipping;

    private String shop_words;

    private Section agreement_price;

    private Section guide_price;

    private Section activity_price;

    private Section promote_rate;

    private Section activity_rate;

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

    public Integer getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
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
        return "/v2/GoodsGroup/ApiGoodsList";
    }

    @Override
    public TreeMap<String, Object> getParams() throws MustParamsException {


        TreeMap<String,Object> paramsMap = new TreeMap<String,Object>();

        if(null == getPage()) throw new MustParamsException("对象"+getClass()+": page不能为空");
        if(null == getLimit()) throw new MustParamsException("对象"+getClass()+": limit不能为空");
        paramsMap.put("page", getPage());
        paramsMap.put("limit", getLimit());

        if(null != getSource()) paramsMap.put("source", getSource());
        if(null != getAgreement_price()) paramsMap.put("agreement_price", getAgreement_price());
        if(null != getGuide_price()) paramsMap.put("guide_price", getGuide_price());
        if(null != getActivity_price()) paramsMap.put("activity_price", getActivity_price());
        if(null != getPromote_rate()) paramsMap.put("promote_rate", getPromote_rate());
        if(null != getActivity_rate()) paramsMap.put("activity_rate", getActivity_rate());
        if(null != getIs_free_shipping()) paramsMap.put("is_free_shipping", getIs_free_shipping());
        if(null != getShop_words()) paramsMap.put("shop_words", getShop_words());
        if(null != getGroup_id()) paramsMap.put("group_id", getGroup_id());

        return paramsMap;

    }

    @Override
    public Integer getResponseType() {
        return 1;
    }

    @Override
    public Type getJsonClassType() {
        return new TypeToken<ApiResultList<GoodsGroupGoodsList>>() {}.getType();
    }
}
