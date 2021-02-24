package com.jxhh.order;

import java.io.Serializable;

/**
 *
 * 订单详情
 *
 */
public class OrderDetail {


    /**
     * orderSn1 : 20200622151646241976
     * orderSn2 : 20200622151646241976_2_1
     * orderSn3 : 20200622151646241976_2_1_1
     * source : 2
     * upstreamOrderSn1 : 0
     * upstreamOrderSn2 :
     * address : {"consignee":"长相","phone":"13308889899","province":"安徽省","city":"合肥市","area":"瑶海区","street":"明光路街道","description":"9号"}
     * goods : {"id":9401,"name":"润本（RUNBEN) 宝宝痱子香膏 20g×2支装 止痒膏 婴童护肤 护臀膏 润肤乳","image":"https://img13.360buyimg.com/n1/jfs/t1/126453/35/1319/78959/5ebba3c1E79314ed2/e909785ed7df9118.jpg","sku":9054,"skuName":"【舒缓蚊叮】护肤香膏20g×2支","Total":1,"price":1344}
     * goodsStatus : 0
     * deliverTime : 0
     * deliverName :
     * deliverNo :
     * refundTime : 0
     * afterSaleStatus : 0
     * shopInfo : {"name":"京东自营","companyName":"","contactName":"","mobile":"","phone":"","contactURL":""}
     */

    private String orderSn1;
    private String orderSn2;
    private String orderSn3;
    private Integer source;
    private String upstreamOrderSn1;
    private String upstreamOrderSn2;
    private AddressBean address;
    private GoodsBean goods;
    private Integer goodsStatus;
    private Integer deliverTime;
    private String deliverName;
    private String deliverNo;
    private Integer refundTime;
    private Integer afterSaleStatus;
    private ShopInfoBean shopInfo;

    public String getOrderSn1() {
        return orderSn1;
    }

    public void setOrderSn1(String orderSn1) {
        this.orderSn1 = orderSn1;
    }

    public String getOrderSn2() {
        return orderSn2;
    }

    public void setOrderSn2(String orderSn2) {
        this.orderSn2 = orderSn2;
    }

    public String getOrderSn3() {
        return orderSn3;
    }

    public void setOrderSn3(String orderSn3) {
        this.orderSn3 = orderSn3;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getUpstreamOrderSn1() {
        return upstreamOrderSn1;
    }

    public void setUpstreamOrderSn1(String upstreamOrderSn1) {
        this.upstreamOrderSn1 = upstreamOrderSn1;
    }

    public String getUpstreamOrderSn2() {
        return upstreamOrderSn2;
    }

    public void setUpstreamOrderSn2(String upstreamOrderSn2) {
        this.upstreamOrderSn2 = upstreamOrderSn2;
    }

    public AddressBean getAddress() {
        return address;
    }

    public void setAddress(AddressBean address) {
        this.address = address;
    }

    public GoodsBean getGoods() {
        return goods;
    }

    public void setGoods(GoodsBean goods) {
        this.goods = goods;
    }

    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public Integer getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(Integer deliverTime) {
        this.deliverTime = deliverTime;
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

    public Integer getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Integer refundTime) {
        this.refundTime = refundTime;
    }

    public Integer getAfterSaleStatus() {
        return afterSaleStatus;
    }

    public void setAfterSaleStatus(Integer afterSaleStatus) {
        this.afterSaleStatus = afterSaleStatus;
    }

    public ShopInfoBean getShopInfo() {
        return shopInfo;
    }

    public void setShopInfo(ShopInfoBean shopInfo) {
        this.shopInfo = shopInfo;
    }

    public static class AddressBean implements Serializable {
        /**
         * consignee : 长相
         * phone : 13308889899
         * province : 安徽省
         * city : 合肥市
         * area : 瑶海区
         * street : 明光路街道
         * description : 9号
         */

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

    public static class GoodsBean implements Serializable {
        /**
         * id : 9401
         * name : 润本（RUNBEN) 宝宝痱子香膏 20g×2支装 止痒膏 婴童护肤 护臀膏 润肤乳
         * image : https://img13.360buyimg.com/n1/jfs/t1/126453/35/1319/78959/5ebba3c1E79314ed2/e909785ed7df9118.jpg
         * sku : 9054
         * skuName : 【舒缓蚊叮】护肤香膏20g×2支
         * Total : 1
         * price : 1344
         */

        private Long id;
        private String name;
        private String image;
        private Long sku;
        private String skuName;
        private Long Total;
        private Long price;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
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

        public Long getTotal() {
            return Total;
        }

        public void setTotal(Long total) {
            Total = total;
        }

        public Long getPrice() {
            return price;
        }

        public void setPrice(Long price) {
            this.price = price;
        }
    }

    public static class ShopInfoBean implements Serializable {
        /**
         * name : 京东自营
         * companyName :
         * contactName :
         * mobile :
         * phone :
         * contactURL :
         */

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
}
