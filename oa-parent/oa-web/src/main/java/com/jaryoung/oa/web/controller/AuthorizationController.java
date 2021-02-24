package com.jaryoung.oa.web.controller;

import com.jaryoung.oa.auth.entity.*;
import com.jaryoung.oa.auth.service.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Authorization)表控制层
 *
 * @author makejava
 * @since 2021-02-24 17:47:58
 */
@RestController
@RequestMapping("authorization")
public class AuthorizationController {
    /**
     * 服务对象
     */
    @Resource
    private AuthorizationService authorizationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Authorization selectOne(Integer id) {
        return this.authorizationService.queryById(id);
    }

}
