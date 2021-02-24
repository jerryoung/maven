package com.jxhh.order;

import com.google.gson.reflect.TypeToken;
import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;
import com.jxhh.res.ApiResultArray;

import java.lang.reflect.Type;
import java.util.List;
import java.util.TreeMap;


/**
 *
 * 下单前置校验
 */
public class CheckOrderRequest implements InterFaceRequest {
    @Override
    public RequestMethod getMethed() {
        return RequestMethod.POST;
    }

    @Override
    public String getUrl() {
        return "/v2/order/beforeCheck";
    }

    @Override
    public TreeMap<String, Object> getParams() throws MustParamsException {
        TreeMap<String ,Object> params = new TreeMap<>();
        params.put("spu",getSpu());
        params.put("address",getAddress());
        return params;
    }

    @Override
    public Integer getResponseType() {
        return 2;
    }

    @Override
    public Type getJsonClassType() {
        return new TypeToken<ApiResultArray<CheckOrder>>() {}.getType();
    }

    private List<Spu> spu;

    private Address address;

    public List<Spu> getSpu() throws MustParamsException {

        if(null == spu) throw new MustParamsException("对象"+getClass()+": spu不能为空");
        for (Spu s: spu) {
            if(null == s.getNumber()) throw new MustParamsException("对象"+getClass()+".Spu: number不能为空");
            if(null == s.getSku()) throw new MustParamsException("对象"+getClass()+".Spu: sku不能为空");
        }
        return spu;
    }

    /**
     * spu
     * @param spu
     */
    public void setSpu(List<Spu> spu) {
        this.spu = spu;
    }

    public Address getAddress() throws MustParamsException {
        if(null == address) throw new MustParamsException("对象"+getClass()+": address不能为空");
        if(null == address.getConsignee()) throw new MustParamsException("对象"+getClass()+".Address: consignee不能为空");
        if(null == address.getProvince()) throw new MustParamsException("对象"+getClass()+".Address: province不能为空");
        if(null == address.getCity()) throw new MustParamsException("对象"+getClass()+".Address: city不能为空");
        if(null == address.getArea()) throw new MustParamsException("对象"+getClass()+".Address: area不能为空");
        if(null == address.getStreet()) throw new MustParamsException("对象"+getClass()+".Address: street不能为空");
        if(null == address.getDescription()) throw new MustParamsException("对象"+getClass()+".Address: description不能为空");
        return address;
    }

    /**
     * 地址信息
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * sku信息
     */
    public static class Spu{

        private Long sku;

        private Long number;

        public Long getSku() {
            return sku;
        }

        /**
         * sku
         * 商品唯一规格id
         * @param sku
         */
        public void setSku(Long sku) {
            this.sku = sku;
        }

        public Long getNumber() {
            return number;
        }

        /**
         * 数量
         * @param number
         */
        public void setNumber(Long number) {
            this.number = number;
        }
    }

    public static class Address{

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

        /**
         * 收货人
         * @param consignee
         */
        public void setConsignee(String consignee) {
            this.consignee = consignee;
        }

        public String getPhone() {
            return phone;
        }

        /**
         * 收货人手机号
         * @return
         */
        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getProvince() {
            return province;
        }

        /**
         * 省
         * @param province
         */
        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        /**
         * 城市
         * @param city
         */
        public void setCity(String city) {
            this.city = city;
        }

        public String getArea() {
            return area;
        }


        /**
         * 区县
         * @return
         */
        public void setArea(String area) {
            this.area = area;
        }

        public String getStreet() {
            return street;
        }

        /**
         * 街道
         * @param street
         */
        public void setStreet(String street) {
            this.street = street;
        }

        public String getDescription() {
            return description;
        }

        /**
         * 详细地址
         * @param description
         */
        public void setDescription(String description) {
            this.description = description;
        }
    }


}


