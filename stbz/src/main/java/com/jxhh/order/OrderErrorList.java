package com.jxhh.order;

public class OrderErrorList {


    /**
     * id : 1131
     * appID : 1
     * sn : 20200922164227796667
     * thirdSn : 20200922164227796667
     * params :
     * createdTime : 1600764148
     * message : 余额不足
     */

    private Long id;
    private Long appID;
    private String sn;
    private String thirdSn;
    private String params;
    private Long createdTime;
    private String message;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAppID() {
        return appID;
    }

    public void setAppID(Long appID) {
        this.appID = appID;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getThirdSn() {
        return thirdSn;
    }

    public void setThirdSn(String thirdSn) {
        this.thirdSn = thirdSn;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
