package com.jaryoung.oa.web.controller;

import com.jaryoung.oa.common.util.JsonUtil;
import com.jaryoung.oa.org.entity.*;
import com.jaryoung.oa.org.service.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Employee)表控制层
 *
 * @author makejava
 * @since 2021-02-24 17:48:24
 */
@RestController
@RequestMapping("employee")
public class EmployeeController {
    /**
     * 服务对象
     */
    @Resource
    private EmployeeService employeeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Employee selectOne(Integer id) {
        System.out.println(JsonUtil.hello());
        return this.employeeService.queryById(id);
    }

}
