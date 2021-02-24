package com.jaryoung.oa.flow.service;

import com.jaryoung.oa.flow.entity.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/application-flow.xml"})
public class ApplicationServiceTest {
    @Autowired
    private ApplicationService applicationService;

    @Test
    public void insert() {
        Application application = new Application();
        application.setEmployeeId(1);
        application.setDays(12);

        Application insert = applicationService.insert(application);
        Assert.assertNotNull(insert);
        Assert.assertEquals(application.getEmployeeId(), insert.getEmployeeId());
        Assert.assertEquals(application.getDays(), insert.getDays());
    }

    @Test
    public void deleteById() {
        Application application = new Application();
        application.setEmployeeId(1);
        application.setDays(12);

        Application insert = applicationService.insert(application);

        applicationService.deleteById(insert.getId());
        Assert.assertNull(applicationService.queryById(insert.getId()));
    }
}
