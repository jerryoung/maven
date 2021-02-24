package com.jaryoung.oa.web.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath*:application-web.xml", "classpath*:spring-servlet.xml"})
public class EmployeeControllerTest {

    @Resource
    private EmployeeController employeeController;

    @Test
    public void selectOne() {
        employeeController.selectOne(1);
    }
}
