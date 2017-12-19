package com.test;

import com.travel.dao.AttractionInfoDao;
import com.travel.entity.AttractionInfoEntity;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author:4mermory
 * @Description:这是一个主要
    的测试方法的 测试类
 * @Date:created in  2017-12-2017/12/18  16:37
            * @Modified By:
            */

    public class test {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AttractionInfoDao attractionInfoDao = (AttractionInfoDao) applicationContext.getBean("attractionInfoDao");
        AttractionInfoEntity attr = attractionInfoDao.queryOne(1);
    }

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AttractionInfoDao attractionInfoDao = (AttractionInfoDao) applicationContext.getBean("attractionInfoDao");
        List<AttractionInfoEntity> list = attractionInfoDao.queryAll();
        for (AttractionInfoEntity attractionInfoEntity : list) {
            System.out.println(attractionInfoEntity);
        }
    }








}
