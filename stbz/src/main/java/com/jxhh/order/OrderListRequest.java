package com.jxhh.order;

import com.google.gson.reflect.TypeToken;
import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;
import com.jxhh.res.ApiResultList;

import java.lang.reflect.Type;
import java.util.TreeMap;

/**
 *
 * 订单列表请求类
 */
public class OrderListRequest implements InterFaceRequest {

    private Integer page;

    private Integer limit;

    private Search search;

    public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
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



    @Override
    public RequestMethod getMethed() {
        return RequestMethod.GETBODY;
    }

    @Override
    public String getUrl() {
        return "/v2/order";
    }

    @Override
    public TreeMap<String, Object> getParams() throws MustParamsException {

        TreeMap<String,Object> params = new TreeMap<>();
        if(null == getPage()) throw new MustParamsException("对象"+getClass()+": page不能为空");
        if(null == getLimit()) throw new MustParamsException("对象"+getClass()+": limit不能为空");
        params.put("page",getPage());
        params.put("limit",getLimit());
        if(null != getSearch()) params.put("search",getSearch());

        return params;

    }

    @Override
    public Integer getResponseType() {
        return 1;
    }

    @Override
    public Type getJsonClassType() {
        return new TypeToken<ApiResultList<OrderList>>() {}.getType();
    }

    public static class Search{

        private String goodsName;
        private String consignee;
        private String phone;
        private String thirdSn;
        private String sn;

        public String getConsignee() {
            return consignee;
        }

        public void setConsignee(String consignee) {
            this.consignee = consignee;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getThirdSn() {
            return thirdSn;
        }

        public void setThirdSn(String thirdSn) {
            this.thirdSn = thirdSn;
        }

        public String getSn() {
            return sn;
        }

        public void setSn(String sn) {
            this.sn = sn;
        }

        public String getGoodsName() {
            return goodsName;
        }
        public void setGoodsName(String goodsName) {
            this.goodsName = goodsName;
        }

        private CreatedTime createdTime;

        public CreatedTime getCreatedTime() {
            return createdTime;
        }
        public void setCreatedTime(CreatedTime createdTime) {
            this.createdTime = createdTime;
        }

        public static class CreatedTime{

            private Long from;
            private Long to;
            public Long getFrom() {
                return from;
            }
            public void setFrom(Long from) {
                this.from = from;
            }
            public Long getTo() {
                return to;
            }
            public void setTo(Long to) {
                this.to = to;
            }

        }


    }



}
