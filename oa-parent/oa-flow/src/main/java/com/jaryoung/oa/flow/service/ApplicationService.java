package com.jaryoung.oa.flow.service;

import com.jaryoung.oa.flow.entity.Application;

import java.util.List;

/**
 * (Application)表服务接口
 *
 * @author makejava
 * @since 2021-02-23 17:37:22
 */
public interface ApplicationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Application queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Application> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param application 实例对象
     * @return 实例对象
     */
    Application insert(Application application);

    /**
     * 修改数据
     *
     * @param application 实例对象
     * @return 实例对象
     */
    Application update(Application application);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
