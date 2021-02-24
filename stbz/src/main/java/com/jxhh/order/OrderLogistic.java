package com.jxhh.order;

import java.util.List;

/**
 *
 * 物流信息返回
 */
public class OrderLogistic {


    private List<OrderLogisticList> list;

    private OrderLogisticInfo info;

    public List<OrderLogisticList> getList() {
        return list;
    }

    public void setList(List<OrderLogisticList> list) {
        this.list = list;
    }

    public OrderLogisticInfo getInfo() {
        return info;
    }

    public void setInfo(OrderLogisticInfo info) {
        this.info = info;
    }
}
