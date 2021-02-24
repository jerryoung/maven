package com.jxhh.res;

/**
 * API请求通用返回
 */
public class ApiResultList<T> {


    private Integer code;

    private String msg;

    private ApiResultListData<T> data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ApiResultListData<T> getData() {
        return data;
    }

    public void setData(ApiResultListData<T> data) {
        this.data = data;
    }



}
