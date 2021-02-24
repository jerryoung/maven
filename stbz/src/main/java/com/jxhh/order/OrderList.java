package com.jxhh.order;

import java.util.List;

/**
 *
 * 订单列表
 */
public class OrderList {


    /**
     * id : 11902
     * sn : 20200624150036412773
     * thirdSn : SN20200624150005xq
     * logisticFee : 800
     * goodsFee : 588
     * address : {"consignee":"小明","phone":"13800138000","province":"北京","city":"北京市","area":"东城区","street":"其他","description":"的的"}
     * createdTime : 1592982036
     * payStatus : 1
     * checkStatus : 1
     * status : 1
     * children : [{"sn":"20200624150036412773_2_1","order_sn":"","money":0,"source":2,"logisticFee":800,"goodsFee":588,"goodsStatus":0,"orderStatus":2,"isRefund":false,"goods":[{"sn":"20200624150036412773_2_1_1","goodsId":624977,"sku":4490638,"skuName":"默认","image":"https://img13.360buyimg.com/n1/jfs/t1/110607/38/7067/655720/5e574610E736ca2f9/3ab82f96945f6f07.png","name":"三只松鼠重庆酸辣粉x1桶 方便面 网红方便素食粉丝风味地方特产130g","number":1,"price":588,"refundTime":0,"createdTime":1592982037,"payStatus":0,"deliverName":"","deliverNo":"","afterSaleStatus":0}],"deliverTime":0,"createdTime":1592982037,"shopInfo":{"name":"京东自营","companyName":"","contactName":"","mobile":"","phone":"","contactURL":""}}]
     */

    private Long id;
    private String sn;
    private String thirdSn;
    private Long logisticFee;
    private Long goodsFee;
    /**
     * consignee : 小明
     * phone : 13800138000
     * province : 北京
     * city : 北京市
     * area : 东城区
     * street : 其他
     * description : 的的
     */

    private AddressBean address;
    private Integer createdTime;
    private Integer payStatus;
    private Integer checkStatus;
    private Integer status;
    /**
     * sn : 20200624150036412773_2_1
     * order_sn :
     * money : 0
     * source : 2
     * logisticFee : 800
     * goodsFee : 588
     * goodsStatus : 0
     * orderStatus : 2
     * isRefund : false
     * goods : [{"sn":"20200624150036412773_2_1_1","goodsId":624977,"sku":4490638,"skuName":"默认","image":"https://img13.360buyimg.com/n1/jfs/t1/110607/38/7067/655720/5e574610E736ca2f9/3ab82f96945f6f07.png","name":"三只松鼠重庆酸辣粉x1桶 方便面 网红方便素食粉丝风味地方特产130g","number":1,"price":588,"refundTime":0,"createdTime":1592982037,"payStatus":0,"deliverName":"","deliverNo":"","afterSaleStatus":0}]
     * deliverTime : 0
     * createdTime : 1592982037
     * shopInfo : {"name":"京东自营","companyName":"","contactName":"","mobile":"","phone":"","contactURL":""}
     */

    private List<ChildrenBean> children;

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

    public String getThirdSn() {
        return thirdSn;
    }

    public void setThirdSn(String thirdSn) {
        this.thirdSn = thirdSn;
    }

    public Long getLogisticFee() {
        return logisticFee;
    }

    public void setLogisticFee(Long logisticFee) {
        this.logisticFee = logisticFee;
    }

    public Long getGoodsFee() {
        return goodsFee;
    }

    public void setGoodsFee(Long goodsFee) {
        this.goodsFee = goodsFee;
    }

    public AddressBean getAddress() {
        return address;
    }

    public void setAddress(AddressBean address) {
        this.address = address;
    }

    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<ChildrenBean> getChildren() {
        return children;
    }

    public void setChildren(List<ChildrenBean> children) {
        this.children = children;
    }

    public static class AddressBean {
        private String consignee;
        private String phone;
        private String province;
        private String city;
        private String area;
        private String street;
        private String description;

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

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    public static class ChildrenBean {
        private String sn;
        private String order_sn;
        private Long money;
        private Integer source;
        private Long logisticFee;
        private Long goodsFee;
        private Integer goodsStatus;
        private Integer orderStatus;
        private Boolean isRefund;
        private Integer deliverTime;
        private Integer createdTime;
        /**
         * name : 京东自营
         * companyName :
         * contactName :
         * mobile :
         * phone :
         * contactURL :
         */

        private ShopInfoBean shopInfo;
        /**
         * sn : 20200624150036412773_2_1_1
         * goodsId : 624977
         * sku : 4490638
         * skuName : 默认
         * image : https://img13.360buyimg.com/n1/jfs/t1/110607/38/7067/655720/5e574610E736ca2f9/3ab82f96945f6f07.png
         * name : 三只松鼠重庆酸辣粉x1桶 方便面 网红方便素食粉丝风味地方特产130g
         * number : 1
         * price : 588
         * refundTime : 0
         * createdTime : 1592982037
         * payStatus : 0
         * deliverName :
         * deliverNo :
         * afterSaleStatus : 0
         */

        private List<GoodsBean> goods;

        public String getSn() {
            return sn;
        }

        public void setSn(String sn) {
            this.sn = sn;
        }

        public String getOrder_sn() {
            return order_sn;
        }

        public void setOrder_sn(String order_sn) {
            this.order_sn = order_sn;
        }

        public Long getMoney() {
            return money;
        }

        public void setMoney(Long money) {
            this.money = money;
        }

        public Integer getSource() {
            return source;
        }

        public void setSource(Integer source) {
            this.source = source;
        }

        public Long getLogisticFee() {
            return logisticFee;
        }

        public void setLogisticFee(Long logisticFee) {
            this.logisticFee = logisticFee;
        }

        public Long getGoodsFee() {
            return goodsFee;
        }

        public void setGoodsFee(Long goodsFee) {
            this.goodsFee = goodsFee;
        }

        public Integer getGoodsStatus() {
            return goodsStatus;
        }

        public void setGoodsStatus(Integer goodsStatus) {
            this.goodsStatus = goodsStatus;
        }

        public Integer getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
        }

        public Boolean getRefund() {
            return isRefund;
        }

        public void setRefund(Boolean refund) {
            isRefund = refund;
        }

        public Integer getDeliverTime() {
            return deliverTime;
        }

        public void setDeliverTime(Integer deliverTime) {
            this.deliverTime = deliverTime;
        }

        public Integer getCreatedTime() {
            return createdTime;
        }

        public void setCreatedTime(Integer createdTime) {
            this.createdTime = createdTime;
        }

        public ShopInfoBean getShopInfo() {
            return shopInfo;
        }

        public void setShopInfo(ShopInfoBean shopInfo) {
            this.shopInfo = shopInfo;
        }

        public List<GoodsBean> getGoods() {
            return goods;
        }

        public void setGoods(List<GoodsBean> goods) {
            this.goods = goods;
        }

        public static class ShopInfoBean {
            private String name;
            private String companyName;
            private String contactName;
            private String mobile;
            private String phone;
            private String contactURL;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCompanyName() {
                return companyName;
            }

            public void setCompanyName(String companyName) {
                this.companyName = companyName;
            }

            public String getContactName() {
                return contactName;
            }

            public void setContactName(String contactName) {
                this.contactName = contactName;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getContactURL() {
                return contactURL;
            }

            public void setContactURL(String contactURL) {
                this.contactURL = contactURL;
            }
        }

        public static class GoodsBean {
            private String sn;
            private Long goodsId;
            private Long sku;
            private String skuName;
            private String image;
            private String name;
            private Long number;
            private Long price;
            private Integer refundTime;
            private Integer createdTime;
            private Integer payStatus;
            private String deliverName;
            private String deliverNo;
            private Integer afterSaleStatus;

            public String getSn() {
                return sn;
            }

            public void setSn(String sn) {
                this.sn = sn;
            }

            public Long getGoodsId() {
                return goodsId;
            }

            public void setGoodsId(Long goodsId) {
                this.goodsId = goodsId;
            }

            public Long getSku() {
                return sku;
            }

            public void setSku(Long sku) {
                this.sku = sku;
            }

            public String getSkuName() {
                return skuName;
            }

            public void setSkuName(String skuName) {
                this.skuName = skuName;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Long getNumber() {
                return number;
            }

            public void setNumber(Long number) {
                this.number = number;
            }

            public Long getPrice() {
                return price;
            }

            public void setPrice(Long price) {
                this.price = price;
            }

            public Integer getRefundTime() {
                return refundTime;
            }

            public void setRefundTime(Integer refundTime) {
                this.refundTime = refundTime;
            }

            public Integer getCreatedTime() {
                return createdTime;
            }

            public void setCreatedTime(Integer createdTime) {
                this.createdTime = createdTime;
            }

            public Integer getPayStatus() {
                return payStatus;
            }

            public void setPayStatus(Integer payStatus) {
                this.payStatus = payStatus;
            }

            public String getDeliverName() {
                return deliverName;
            }

            public void setDeliverName(String deliverName) {
                this.deliverName = deliverName;
            }

            public String getDeliverNo() {
                return deliverNo;
            }

            public void setDeliverNo(String deliverNo) {
                this.deliverNo = deliverNo;
            }

            public Integer getAfterSaleStatus() {
                return afterSaleStatus;
            }

            public void setAfterSaleStatus(Integer afterSaleStatus) {
                this.afterSaleStatus = afterSaleStatus;
            }



        }
    }
}
