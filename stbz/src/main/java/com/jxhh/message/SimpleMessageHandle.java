package com.jxhh.message;

public class SimpleMessageHandle implements MessageHandle{


    @Override
    public Boolean orderDelivery(String orderSn, String sku) {
        System.out.println("订单商家发货");
        return true;
    }

    @Override
    public Boolean orderDelivered(String orderSn, String sku) {
        System.out.println("订单买家收货");
        return true;
    }

    @Override
    public Boolean orderSuccess(String orderSn, String sku) {
        System.out.println("订单成功");
        return true;
    }

    @Override
    public Boolean orderCancel(String orderSn, String sku) {
        System.out.println("订单取消");
        return true;
    }

    @Override
    public Boolean goodsUndercarriage(MessageResultGoods.DataBean dataBean) {
        System.out.println("商品下架");
        return true;
    }

    @Override
    public Boolean goodsOnSale(MessageResultGoods.DataBean dataBean) {
        System.out.println("商品上架");
        return true;
    }

    @Override
    public Boolean goodsAlter(MessageResultGoods.DataBean dataBean) {
        System.out.println("商品信息修改");
        return true;
    }

    @Override
    public Boolean goodsPriceAlter(MessageResultGoods.DataBean dataBean) {
        System.out.println("商品价格修改");
        return true;
    }

    @Override
    public Boolean goodsStorageAdd(MessageResultGoods.DataBean dataBean) {
        System.out.println("选品库新增");
        return true;
    }

    @Override
    public Boolean goodsStorageDelete() {
        System.out.println("选品库清空");
        return true;
    }

    @Override
    public Boolean goodsStorageRemove(MessageResultGoods.DataBean dataBean) {
        System.out.println("选品库删除商品");
        return true;
    }

    @Override
    public Boolean afterSaleRefuse(Integer afterSaleId, String orderSn, String sku) {
        System.out.println("选品库删除商品");
        return true;
    }

    @Override
    public Boolean afterSaleAgree(Integer afterSaleId, String orderSn, String sku) {
        System.out.println("售后商家同意");
        return true;
    }

    @Override
    public Boolean afterSaleSuccess(Integer afterSaleId, String orderSn, String sku) {
        System.out.println("售后成功");
        return true;
    }
}
