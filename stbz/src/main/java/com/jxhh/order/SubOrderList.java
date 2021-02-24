package com.jxhh.order;

import java.util.List;

public class SubOrderList {


    /**
     * sn : 20200810105625335596_2_1
     * order_sn :
     * money : 0
     * source : 2
     * logisticFee : 0
     * goodsFee : 10168
     * goodsStatus : 3
     * orderStatus : 1
     * isRefund : false
     * goods : [{"sn":"20200810105625335596_2_1_1","goodsId":128365,"sku":869929,"skuName":"免手洗吸水海绵拖把","image":"https://img13.360buyimg.com/n1/jfs/t1/118454/4/6887/411987/5ebe5719E25486934/a5031cf6c43b1736.jpg","name":"优利洁NewLeader 海绵吸水拖把 免手洗懒人对折胶棉拖把拖布墩布地拖神器家用 办公干湿两用 二个原装拖头","number":1,"price":2828,"refundTime":0,"createdTime":1597028185,"payStatus":1,"deliverName":"京东快递","deliverNo":"JD0022521069736","afterSaleStatus":0},{"sn":"20200810105625335596_2_1_2","goodsId":245279,"sku":868972,"skuName":"心相印无芯卷纸140g*12卷","image":"https://img13.360buyimg.com/n1/jfs/t1/68464/37/6526/62441/5d4a9a6aE7d90f26d/aaede37442fe55be.jpg","name":"心相印无芯卷纸 心柔系列 卷纸100g*10卷  3层4层随机发","number":3,"price":2201,"refundTime":0,"createdTime":1597028185,"payStatus":1,"deliverName":"京东快递","deliverNo":"JD0022521016152","afterSaleStatus":0},{"sn":"20200810105625335596_2_1_3","goodsId":111221,"sku":837247,"skuName":"默认","image":"https://img13.360buyimg.com/n1/jfs/t20089/8/1762041473/282853/85dcd953/5b267f99Na76bd355.jpg","name":"佳佰 厨房专用网面摩擦洗碗布抹布吸水刷锅不伤锅清洁布 三片装","number":1,"price":737,"refundTime":0,"createdTime":1597028185,"payStatus":1,"deliverName":"京东快递","deliverNo":"JD0022521069771","afterSaleStatus":0}]
     * deliverTime : 1597028187
     * createdTime : 1597028185
     * thirdSn : 20200810105625
     * address : {"consignee":"李木子","phone":"13149570345","province":"北京市","city":"市辖区","area":"丰台区","street":"卢沟桥地区","description":"马官营家园1号楼1单元102"}
     * shopInfo : {"name":"","companyName":"","contactName":"","mobile":"","phone":"","contactURL":""}
     */

    private String sn;
    private String order_sn;
    private Long money;
    private Integer source;
    private Long logisticFee;
    private Long goodsFee;
    private Integer goodsStatus;
    private Integer orderStatus;
    private boolean isRefund;
    private Integer deliverTime;
    private Integer createdTime;
    private String thirdSn;
    /**
     * consignee : 李木子
     * phone : 13149570345
     * province : 北京市
     * city : 市辖区
     * area : 丰台区
     * street : 卢沟桥地区
     * description : 马官营家园1号楼1单元102
     */

    private AddressBean address;
    /**
     * name :
     * companyName :
     * contactName :
     * mobile :
     * phone :
     * contactURL :
     */

    private ShopInfoBean shopInfo;
    /**
     * sn : 20200810105625335596_2_1_1
     * goodsId : 128365
     * sku : 869929
     * skuName : 免手洗吸水海绵拖把
     * image : https://img13.360buyimg.com/n1/jfs/t1/118454/4/6887/411987/5ebe5719E25486934/a5031cf6c43b1736.jpg
     * name : 优利洁NewLeader 海绵吸水拖把 免手洗懒人对折胶棉拖把拖布墩布地拖神器家用 办公干湿两用 二个原装拖头
     * number : 1
     * price : 2828
     * refundTime : 0
     * createdTime : 1597028185
     * payStatus : 1
     * deliverName : 京东快递
     * deliverNo : JD0022521069736
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

    public boolean isIsRefund() {
        return isRefund;
    }

    public void setIsRefund(boolean isRefund) {
        this.isRefund = isRefund;
    }

    public int getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(Integer deliverTime) {
        this.deliverTime = deliverTime;
    }

    public int getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
    }

    public String getThirdSn() {
        return thirdSn;
    }

    public void setThirdSn(String thirdSn) {
        this.thirdSn = thirdSn;
    }

    public AddressBean getAddress() {
        return address;
    }

    public void setAddress(AddressBean address) {
        this.address = address;
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

        public int getPayStatus() {
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
