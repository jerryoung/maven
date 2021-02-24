package com.jxhh.finance;


/**
 *
 * 资金流水列表
 */
public class CashFlowList {


    /**
     * id : 58186
     * sn : 20201102120535446207
     * order_sn : 20201102120535446207
     * direction : 1
     * money : 30
     * type : 5
     * balance_before : 3781
     * balance_after : 3751
     * update_time : 1604289935
     * appid : 267
     * pay_type : 0
     */

    private Long id;
    private String sn;
    private String order_sn;
    private String direction;
    private Integer money;
    private Integer type;
    private Integer balance_before;
    private Integer balance_after;
    private Integer update_time;
    private Integer pay_type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getBalance_before() {
        return balance_before;
    }

    public void setBalance_before(Integer balance_before) {
        this.balance_before = balance_before;
    }

    public Integer getBalance_after() {
        return balance_after;
    }

    public void setBalance_after(Integer balance_after) {
        this.balance_after = balance_after;
    }

    public Integer getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Integer update_time) {
        this.update_time = update_time;
    }

    public Integer getPay_type() {
        return pay_type;
    }

    public void setPay_type(Integer pay_type) {
        this.pay_type = pay_type;
    }
}
