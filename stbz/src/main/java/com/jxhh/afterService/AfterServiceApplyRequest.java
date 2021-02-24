package com.jxhh.afterService;

import com.google.gson.reflect.TypeToken;
import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;
import com.jxhh.res.ApiResultObject;

import java.lang.reflect.Type;
import java.util.List;
import java.util.TreeMap;


/**
 *
 *  售后申请请求
 *
 */
public class AfterServiceApplyRequest implements InterFaceRequest{


    private String orderSn;

    private Long sku;

    private Long num;

    private Long goodsFee;

    private Long logisticFee;

    private String serviceTypeCode;

    private String pickTypeCode;

    private String packageTypeCode;

    private String returnTypeCode;

    private String reasonsTypeCode;

    private String reasonsDescription;

    private List<String> vouchers;

    private UserInfo userInfo;

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

    public String getPackageTypeCode() {
        return packageTypeCode;
    }

    public void setPackageTypeCode(String packageTypeCode) {
        this.packageTypeCode = packageTypeCode;
    }

    public String getReturnTypeCode() {
        return returnTypeCode;
    }

    public void setReturnTypeCode(String returnTypeCode) {
        this.returnTypeCode = returnTypeCode;
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

    public List<String> getVouchers() {
        return vouchers;
    }

    public void setVouchers(List<String> vouchers) {
        this.vouchers = vouchers;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public static class UserInfo{

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


    @Override
    public RequestMethod getMethed() {
        return RequestMethod.POST;
    }

    @Override
    public String getUrl() {
        return "/v2/afterSale";
    }

    @Override
    public TreeMap<String, Object> getParams() throws MustParamsException {

        if(null == getOrderSn()) throw new MustParamsException("对象"+getClass()+": orderSn不能为空");
        if(null == getSku()) throw new MustParamsException("对象"+getClass()+": sku不能为空");
        if(null == getNum()) throw new MustParamsException("对象"+getClass()+": num不能为空");
//        if(null == getGoodsFee()) throw new MustParamsException("对象"+getClass()+": goodsFee不能为空");
        if(null == getLogisticFee()) throw new MustParamsException("对象"+getClass()+": logisticFee不能为空");
        if(null == getServiceTypeCode()) throw new MustParamsException("对象"+getClass()+": serviceTypeCode不能为空");
//        if(null == getPickTypeCode()) throw new MustParamsException("对象"+getClass()+": pickTypeCode不能为空");
//        if(null == getPackageTypeCode()) throw new MustParamsException("对象"+getClass()+": packageTypeCode不能为空");
//        if(null == getReturnTypeCode()) throw new MustParamsException("对象"+getClass()+": returnTypeCode不能为空");
//        if(null == getReasonsTypeCode()) throw new MustParamsException("对象"+getClass()+": reasonsTypeCode不能为空");
        if(null == getReasonsDescription()) throw new MustParamsException("对象"+getClass()+": reasonsDescription不能为空");

        TreeMap<String,Object> params = new TreeMap<>();
        params.put("orderSn",getOrderSn());
        params.put("sku",getSku());
        params.put("num",getNum());
        params.put("logisticFee",getLogisticFee());
        params.put("serviceTypeCode",getServiceTypeCode());
        params.put("reasonsDescription",getReasonsDescription());
        if(null != getGoodsFee()) params.put("goodsFee",getGoodsFee());
        if(null != getPickTypeCode()) params.put("pickTypeCode",getPickTypeCode());
        if(null != getPackageTypeCode()) params.put("packageTypeCode",getPackageTypeCode());
        if(null != getReturnTypeCode()) params.put("returnTypeCode",getReturnTypeCode());
        if(null != getReturnTypeCode()) params.put("reasonsTypeCode",getReturnTypeCode());
        if(null != getUserInfo()) params.put("userInfo",getUserInfo());

        return params;

    }

    @Override
    public Integer getResponseType() {
        return 0;
    }

    @Override
    public Type getJsonClassType() {
        return new TypeToken<ApiResultObject<Integer>>() {}.getType();
    }

}
