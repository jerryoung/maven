package com.jxhh.message;

/**
 * 消息类型
 */
public class MessageType {


    /**
     * 商家已发货
     */
    public static final String ORDERDELIVERY = "order.delivery";


    /**
     * 商家已收货
     */
    public static final String ORDERDELIVERED = "order.delivered";


    /**
     *
     * 交易成功
     */
    public static final String ORDERSUCCESS = "order.success";


    /**
     *
     * 订单取消
     */
    public static final String ORDERCANCEL = "order.cancel";


    /**
     * 商品下架
     */
    public static final String GOODSUNDERCARRIAGE = "goods.undercarriage";


    /**
     *
     * 商品上架
     */
    public static final String GOODSONSALE = "goods.on.sale";


    /**
     *
     * 商品修改
     */
    public static final String GOODSALTER = "goods.alter";


    /**
     * 商品价格修改
     */
    public static final String GOODSPRICEALTER = "goods.price.alter";


    /**
     * 商品库添加商品
     */
    public static final String GOODSSTORAGEADD = "goods.storage.add";


    /**
     *
     * 商品库清空
     */
    public static final String GOODSSTORAGEDELETE  = "goods.storage.delete ";

    /**
     * 商品库删除商品
     */
    public static final String GOODSSTORAGEREMOVE = "goods.storage.remove";

    /**
     *
     * 售后拒绝
     */
    public static final String AFTERSALEREFUSE = "afterSale.refuse";


    /**
     * 售后商家同意
     */
    public static final String AFTERSALEAGREE = "afterSale.agree";


    /**
     *
     * 售后成功
     */
    public static final String AFTERSALESUCCESS = "afterSale.success";


}
