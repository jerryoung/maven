package com.jxhh.afterService;

import java.util.List;

/**
 * 售后校验
 *
 */
public class BeforeCheck {
    /**
     * num : 0
     * serviceType : [{"code":"40","name":"退款"}]
     * reasonsType : [{"code":"20006","name":"不想买了/等不及/拍错","needVoucher":false,"refundCarriage":true,"tip":""},{"code":"20002","name":"卖家缺货","needVoucher":false,"refundCarriage":true,"tip":""},{"code":"20003","name":"卖家不支持在线交易","needVoucher":false,"refundCarriage":true,"tip":""},{"code":"20004","name":"未按约定时间发货","needVoucher":true,"refundCarriage":true,"tip":""},{"code":"20005","name":"卖家调价","needVoucher":false,"refundCarriage":true,"tip":""}]
     */

    private Integer num;
    /**
     * code : 40
     * name : 退款
     */

    private List<ServiceTypeBean> serviceType;
    /**
     * code : 20006
     * name : 不想买了/等不及/拍错
     * needVoucher : false
     * refundCarriage : true
     * tip :
     */

    private List<ReasonsTypeBean> reasonsType;

    public int getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public List<ServiceTypeBean> getServiceType() {
        return serviceType;
    }

    public void setServiceType(List<ServiceTypeBean> serviceType) {
        this.serviceType = serviceType;
    }

    public List<ReasonsTypeBean> getReasonsType() {
        return reasonsType;
    }

    public void setReasonsType(List<ReasonsTypeBean> reasonsType) {
        this.reasonsType = reasonsType;
    }

    public static class ServiceTypeBean {
        private String code;
        private String name;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class ReasonsTypeBean {
        private String code;
        private String name;
        private Boolean needVoucher;
        private Boolean refundCarriage;
        private String tip;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isNeedVoucher() {
            return needVoucher;
        }

        public void setNeedVoucher(Boolean needVoucher) {
            this.needVoucher = needVoucher;
        }

        public boolean isRefundCarriage() {
            return refundCarriage;
        }

        public void setRefundCarriage(Boolean refundCarriage) {
            this.refundCarriage = refundCarriage;
        }

        public String getTip() {
            return tip;
        }

        public void setTip(String tip) {
            this.tip = tip;
        }
    }




}
