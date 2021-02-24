package com.jaryoung.oa.org.service;

import com.jaryoung.oa.org.entity.Employee;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:application-org.xml")
@Transactional
public class EmployeeServiceTest extends TestCase {
    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testQueryAllByLimit() {
        testInsert();
        List<Employee> employees = employeeService.queryAllByLimit(0, 1);
        Assert.assertFalse(CollectionUtils.isEmpty(employees));
    }

    @Test
    public void testInsert() {
        Employee employee = new Employee();
        employee.setName("涨薪");
        employee.setAge(18);
        Employee insert = employeeService.insert(employee);

        Assert.assertNotNull(insert.getId());
        Assert.assertEquals(employee.getName(), insert.getName());
        Assert.assertEquals(employee.getAge(), insert.getAge());
    }
}
