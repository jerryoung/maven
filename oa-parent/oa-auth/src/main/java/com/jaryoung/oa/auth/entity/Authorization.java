package com.jaryoung.oa.auth.entity;

import java.io.Serializable;

/**
 * (Authorization)实体类
 *
 * @author makejava
 * @since 2021-02-23 17:16:36
 */
public class Authorization implements Serializable {
    private static final long serialVersionUID = 928799322565298833L;

    private Integer id;

    private Integer employeeId;

    private Integer roleId;


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

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

}
