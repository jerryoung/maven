package com.jaryoung.oa.web.controller;

import com.jaryoung.oa.auth.entity.Authorization;
import com.jaryoung.oa.flow.entity.Application;
import com.jaryoung.oa.org.entity.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath*:application-web.xml", "classpath*:spring-servlet.xml"})
public class ApiTest {

    @Resource
    private Api api;


    @Test
    public void createEmployee() {
        Employee employee = new Employee();
        employee.setName("张三");
        employee.setAge(18);
        Employee insert = api.createEmployee(employee);

        Assert.assertNotNull(insert.getId());
        Assert.assertEquals(employee.getName(), insert.getName());
        Assert.assertEquals(employee.getAge(), insert.getAge());

    }

    @Test
    public void authorization() {
        Integer employeeId = 1;
        Authorization authorization = new Authorization();
        authorization.setEmployeeId(employeeId);
        authorization.setRoleId(1);

        Authorization insert = api.authorization(authorization);

        Assert.assertNotNull(insert.getId());
        Assert.assertEquals(authorization.getEmployeeId(), insert.getEmployeeId());
        Assert.assertEquals(authorization.getRoleId(), insert.getRoleId());

    }

    @Test
    public void unAuthorization() {
        Integer authorization = 1;
        String result = api.unAuthorization(authorization);
        Assert.assertEquals(Api.OK, result);
    }

    @Test
    public void application() {
        Application application = new Application();
        application.setEmployeeId(1);
        application.setDays(25);
        Application insert = api.application(application);

        Assert.assertNotNull(insert.getId());
        Assert.assertEquals(application.getEmployeeId(), insert.getEmployeeId());
        Assert.assertEquals(application.getDays(), insert.getDays());
    }
}
