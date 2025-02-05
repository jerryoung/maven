package com.jaryoung.oa.flow.service.impl;

import com.jaryoung.oa.flow.entity.Application;
import com.jaryoung.oa.flow.dao.ApplicationDao;
import com.jaryoung.oa.flow.service.ApplicationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Application)表服务实现类
 *
 * @author makejava
 * @since 2021-02-23 17:37:23
 */
@Service("applicationService")
public class ApplicationServiceImpl implements ApplicationService {
    @Resource
    private ApplicationDao applicationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Application queryById(Integer id) {
        return this.applicationDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Application> queryAllByLimit(int offset, int limit) {
        return this.applicationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param application 实例对象
     * @return 实例对象
     */
    @Override
    public Application insert(Application application) {
        this.applicationDao.insert(application);
        return application;
    }

    /**
     * 修改数据
     *
     * @param application 实例对象
     * @return 实例对象
     */
    @Override
    public Application update(Application application) {
        this.applicationDao.update(application);
        return this.queryById(application.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.applicationDao.deleteById(id) > 0;
    }
}
