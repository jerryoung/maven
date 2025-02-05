package com.jaryoung.oa.auth.dao;

import com.jaryoung.oa.auth.entity.Authorization;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Authorization)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-23 17:16:36
 */
public interface AuthorizationDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Authorization queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Authorization> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param authorization 实例对象
     * @return 对象列表
     */
    List<Authorization> queryAll(Authorization authorization);

    /**
     * 新增数据
     *
     * @param authorization 实例对象
     * @return 影响行数
     */
    int insert(Authorization authorization);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Authorization> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Authorization> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Authorization> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Authorization> entities);

    /**
     * 修改数据
     *
     * @param authorization 实例对象
     * @return 影响行数
     */
    int update(Authorization authorization);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

