package com.jxhh.order;

import java.io.Serializable;
import java.util.List;

/**
 *
 * 可售性校验
 */
public class CheckBanGoods{


    /**
     * msg : 操作成功
     * code : 1
     * data : {"available":[2033490],"ban":[123]}
     */

    private String msg;
    private Integer code;
    private DataBean data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {

        private List<Long> available;
        private List<Long> ban;

        public List<Long> getAvailable() {
            return available;
        }

        public void setAvailable(List<Long> available) {
            this.available = available;
        }

        public List<Long> getBan() {
            return ban;
        }

        public void setBan(List<Long> ban) {
            this.ban = ban;
        }
    }

}


