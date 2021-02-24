package com.jxhh;

import java.util.List;

/**
 * 通用接口相应类
 * @param <T>
 */
public class ApiResponse<T> {


    private Integer code;

    private String msg;

    private String resultString;

    private T object;

    private Long count;

    private List<T> lists;

    private Long total;

    public Long getTotal() {
        return total;
    }

    public ApiResponse setTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 获取返回code
     * @return
     */
    public Integer getCode() {
        return code;
    }

    public ApiResponse setCode(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * 获取返回msg
     * @return
     */
    public String getMsg() {
        return msg;
    }

    public ApiResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * 获取返回的JSON字符串
     * @return
     */
    public String getResultString() {
        return resultString;
    }

    public ApiResponse setResultString(String resultString) {
        this.resultString = resultString;
        return this;
    }


    /**
     * 获取返回对象的实体
     * 当返回JSON对象的data为一个对象时调用此方法
     * @return
     */
    public T getObject() {
        return object;
    }

    public ApiResponse setObject(T object) {
        this.object = object;
        return this;
    }

    /**
     * 获取列表接口的总条数
     * @return
     */
    public Long getCount() {
        return count;
    }

    public ApiResponse setCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 获取接口列表
     * 当接口为列表类型或返回数据为数据时调用此方法
     * @return
     */
    public List<T> getLists() {
        return lists;
    }

    public ApiResponse setLists(List<T> lists) {
        this.lists = lists;
        return this;
    }


    public static ApiResponse create(){
        return new ApiResponse();
    }

}
