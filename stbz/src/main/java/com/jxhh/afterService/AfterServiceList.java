package com.jxhh.afterService;

/**
 * 售后列表
 *
 */
public class AfterServiceList {


    /**
     * id : 10
     * source : 6
     * orderSn3 : 20191126220039496472_6_1_1
     * orderSn : ME20191126220022744654
     * sku : 433522
     * num : 100
     * goodsFee : 5990
     * logisticFee : 600
     * serviceTypeCode : refund
     * pickTypeCode : xxx
     * reasonsTypeCode : 20006
     * reasonsDescription : 不合适
     * userInfo : {"consignee":"","phone":"","province":"","city":"","area":"","street":""}
     * sellerInfo : {"address":"","phone":"","realName":""}
     * sendData : {"company":"","description":""}
     * status : 3
     * createdTime : 1575885192
     */

    private Long id;
    private Integer source;
    private String orderSn3;
    private String orderSn;
    private Long sku;
    private Long num;
    private Long goodsFee;
    private Long logisticFee;
    private String serviceTypeCode;
    private String pickTypeCode;
    private String reasonsTypeCode;
    private String reasonsDescription;


    /**
     * consignee :
     * phone :
     * province :
     * city :
     * area :
     * street :
     */

    private UserInfoBean userInfo;
    /**
     * address :
     * phone :
     * realName :
     */

    private SellerInfoBean sellerInfo;
    /**
     * company :
     * description :
     */

    private SendDataBean sendData;
    private Integer status;
    private Integer createdTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getOrderSn3() {
        return orderSn3;
    }

    public void setOrderSn3(String orderSn3) {
        this.orderSn3 = orderSn3;
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

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public Long getGoodsFee() {
        return goodsFee;
    }

    public void setGoodsFee(Long goodsFee) {
        this.goodsFee = goodsFee;
    }

    public Long getLogisticFee() {
        return logisticFee;
    }

    public void setLogisticFee(Long logisticFee) {
        this.logisticFee = logisticFee;
    }

    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    public void setServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }

    public String getPickTypeCode() {
        return pickTypeCode;
    }

    public void setPickTypeCode(String pickTypeCode) {
        this.pickTypeCode = pickTypeCode;
    }

    public String getReasonsTypeCode() {
        return reasonsTypeCode;
    }

    public void setReasonsTypeCode(String reasonsTypeCode) {
        this.reasonsTypeCode = reasonsTypeCode;
    }

    public String getReasonsDescription() {
        return reasonsDescription;
    }

    public void setReasonsDescription(String reasonsDescription) {
        this.reasonsDescription = reasonsDescription;
    }

    public UserInfoBean getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfoBean userInfo) {
        this.userInfo = userInfo;
    }

    public SellerInfoBean getSellerInfo() {
        return sellerInfo;
    }

    public void setSellerInfo(SellerInfoBean sellerInfo) {
        this.sellerInfo = sellerInfo;
    }

    public SendDataBean getSendData() {
        return sendData;
    }

    public void setSendData(SendDataBean sendData) {
        this.sendData = sendData;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(int createdTime) {
        this.createdTime = createdTime;
    }

    public static class UserInfoBean {
        private String consignee;
        private String phone;
        private String province;
        private String city;
        private String area;
        private String street;

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
    }

    public static class SellerInfoBean {
        private String address;
        private String phone;
        private String realName;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getRealName() {
            return realName;
        }

        public void setRealName(String realName) {
            this.realName = realName;
        }
    }

    public static class SendDataBean {
        private String company;
        private String description;

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
