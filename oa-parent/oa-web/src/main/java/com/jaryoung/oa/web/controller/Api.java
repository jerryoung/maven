package com.jaryoung.oa.web.controller;

import com.jaryoung.oa.auth.entity.Authorization;
import com.jaryoung.oa.auth.service.AuthorizationService;
import com.jaryoung.oa.common.util.JsonUtil;
import com.jaryoung.oa.flow.entity.Application;
import com.jaryoung.oa.flow.service.ApplicationService;
import com.jaryoung.oa.org.entity.Employee;
import com.jaryoung.oa.org.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Employee)表控制层
 *
 * @author makejava
 * @since 2021-02-24 17:48:24
 */
@RestController
@RequestMapping("/oa/")
public class Api {
    public static final String OK = "ok";
    /**
     * 服务对象
     */
    @Resource
    private EmployeeService employeeService;
    @Resource
    private ApplicationService applicationService;
    @Resource
    private AuthorizationService authorizationService;

    @PostMapping("/createEmployee")
    public Employee createEmployee(@RequestBody Employee employee) {
        System.out.println(JsonUtil.hello());
        return this.employeeService.insert(employee);
    }

    @PostMapping("/authorization")
    public Authorization authorization(@RequestBody Authorization authorization) {
        return this.authorizationService.insert(authorization);
    }

    @PostMapping("/unAuthorization")
    public String unAuthorization(@RequestParam Integer id) {
        this.authorizationService.deleteById(id);
        return OK;
    }

    @PostMapping("/application")
    public Application application(@RequestBody Application application) {
        return this.applicationService.insert(application);
    }

}
