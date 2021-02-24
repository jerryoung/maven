package com.jxhh.message;

/**
 * 售后类实体
 */
public class MessageOrderAfter {

    /**
     * afterSaleId	integer
     * 必须
     * 售后服务单id
     * orderSn	string
     * 必须
     * 订单编号
     * sku	string
     * 必须
     * 商品sku
     */

    private Integer afterSaleId;

    private String orderSn;

    private String sku;

    public Integer getAfterSaleId() {
        return afterSaleId;
    }

    public void setAfterSaleId(Integer afterSaleId) {
        this.afterSaleId = afterSaleId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
}
