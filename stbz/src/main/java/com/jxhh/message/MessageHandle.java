package com.jxhh.message;

/**
 *
 * 消息处理回调接口
 *
 */
public interface MessageHandle {

    /**
     * 订单 商品已发货
     */
    public Boolean orderDelivery(String orderSn, String sku);

    /**
     *
     * 订单 买家已收货
     */
    public Boolean orderDelivered(String orderSn, String sku);


    /**
     * 订单 交易成功
     */
    public Boolean orderSuccess(String orderSn, String sku);


    /**
     *
     * 订单 订单取消
     */
    public Boolean orderCancel(String orderSn, String sku);


    /**
     *
     * 商品 下架
     */
    public Boolean goodsUndercarriage(MessageResultGoods.DataBean dataBean);

    /**
     *
     * 商品 上架
     */
    public Boolean goodsOnSale(MessageResultGoods.DataBean dataBean);


    /**
     *
     * 商品 修改
     */
    public Boolean goodsAlter(MessageResultGoods.DataBean dataBean);

    /**
     *
     * 商品 价格变更
     */
    public Boolean goodsPriceAlter(MessageResultGoods.DataBean dataBean);


    /**
     *
     * 商品 添加选品库
     */
    public Boolean goodsStorageAdd(MessageResultGoods.DataBean dataBean);

    /**
     *
     * 商品 商品库清空
     */
    public Boolean goodsStorageDelete();

    /**
     *
     * 商品 商品库删除商品
     */
    public Boolean goodsStorageRemove(MessageResultGoods.DataBean dataBean);

    /**
     *
     * 售后 商家拒绝
     */
    public Boolean afterSaleRefuse(Integer afterSaleId, String orderSn, String sku);

    /**
     * 售后 商家同意
     */
    public Boolean afterSaleAgree(Integer afterSaleId, String orderSn, String sku);

    /**
     *
     * 售后 退款到账
     */
    public Boolean afterSaleSuccess(Integer afterSaleId, String orderSn, String sku);


}
