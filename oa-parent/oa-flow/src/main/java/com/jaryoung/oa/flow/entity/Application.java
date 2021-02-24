package com.jaryoung.oa.flow.entity;

import java.io.Serializable;

/**
 * (Application)实体类
 *
 * @author makejava
 * @since 2021-02-23 17:37:22
 */
public class Application implements Serializable {
    private static final long serialVersionUID = 914322275300256549L;

    private Integer id;

    private Integer employeeId;

    private Integer days;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

}
