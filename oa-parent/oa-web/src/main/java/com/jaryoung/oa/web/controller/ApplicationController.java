package com.jaryoung.oa.web.controller;

import com.jaryoung.oa.flow.entity.*;
import com.jaryoung.oa.flow.service.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Application)表控制层
 *
 * @author makejava
 * @since 2021-02-24 17:38:35
 */
@RestController
@RequestMapping("application")
public class ApplicationController {
    /**
     * 服务对象
     */
    @Resource
    private ApplicationService applicationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Application selectOne(Integer id) {
        return this.applicationService.queryById(id);
    }

}
