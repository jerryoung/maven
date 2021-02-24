package com.jaryoung.oa.auth.service.impl;

import com.jaryoung.oa.auth.entity.Authorization;
import com.jaryoung.oa.auth.dao.AuthorizationDao;
import com.jaryoung.oa.auth.service.AuthorizationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Authorization)表服务实现类
 *
 * @author makejava
 * @since 2021-02-23 17:16:36
 */
@Service("authorizationService")
public class AuthorizationServiceImpl implements AuthorizationService {
    @Resource
    private AuthorizationDao authorizationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Authorization queryById(Integer id) {
        return this.authorizationDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Authorization> queryAllByLimit(int offset, int limit) {
        return this.authorizationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param authorization 实例对象
     * @return 实例对象
     */
    @Override
    public Authorization insert(Authorization authorization) {
        this.authorizationDao.insert(authorization);
        return authorization;
    }

    /**
     * 修改数据
     *
     * @param authorization 实例对象
     * @return 实例对象
     */
    @Override
    public Authorization update(Authorization authorization) {
        this.authorizationDao.update(authorization);
        return this.queryById(authorization.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.authorizationDao.deleteById(id) > 0;
    }
}
