package com.jaryoung.oa.auth.service;

import com.jaryoung.oa.auth.entity.Authorization;

import java.util.List;

/**
 * (Authorization)表服务接口
 *
 * @author makejava
 * @since 2021-02-23 17:16:36
 */
public interface AuthorizationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Authorization queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Authorization> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param authorization 实例对象
     * @return 实例对象
     */
    Authorization insert(Authorization authorization);

    /**
     * 修改数据
     *
     * @param authorization 实例对象
     * @return 实例对象
     */
    Authorization update(Authorization authorization);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
