package com.jaryoung.oa.auth.service;

import com.jaryoung.oa.auth.entity.Authorization;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:application-auth.xml"})
public class AuthorizationServiceTest {
    @Autowired
    private AuthorizationService authorizationService;

    @Test
    public void insert() {
        Authorization authorization = new Authorization();
        authorization.setEmployeeId(1);
        authorization.setRoleId(1);
        Authorization insert = authorizationService.insert(authorization);
        Assert.assertNotNull(insert);
        Assert.assertEquals(authorization.getEmployeeId(), insert.getEmployeeId());
        Assert.assertEquals(authorization.getRoleId(), insert.getRoleId());
    }

    @Test
    public void deleteById() {
        Authorization authorization = new Authorization();
        authorization.setEmployeeId(1);
        authorization.setRoleId(1);
        Authorization insert = authorizationService.insert(authorization);

        authorizationService.deleteById(insert.getId());
        Assert.assertNull(authorizationService.queryById(insert.getId()));
    }
}
