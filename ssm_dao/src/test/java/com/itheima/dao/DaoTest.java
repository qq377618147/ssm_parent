package com.itheima.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author yuzhang
 * @version 1.0
 * @date 2020/8/16/0016 20:35
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
public class DaoTest {
    @Autowired
    private ItemsDao itemsDao;
    @Test
    public void test01() {
        //ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        //ItemsDao itemsDao = (ItemsDao) app.getBean("itemsDao");
        System.out.println(itemsDao.findAll());
    }
}
