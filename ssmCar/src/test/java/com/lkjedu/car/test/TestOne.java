package com.lkjedu.car.test;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageInfo;
import com.lkjedu.car.beans.CarArea;
import com.lkjedu.car.beans.CarPosition;
import com.lkjedu.car.beans.CarType;
import com.lkjedu.car.mapper.UserMapper;
import com.lkjedu.car.beans.User;
import com.lkjedu.car.service.CarAreaService;
import com.lkjedu.car.service.CarPositionService;
import com.lkjedu.car.service.CarTypeService;
import com.lkjedu.car.service.UserService;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class TestOne {
    @Autowired
    private CarPositionService carPositionService;
    @Autowired
    private CarAreaService carAreaService;
    @Autowired
    private CarTypeService carTypeService;
    @Autowired
    private UserService userService;
    @Test
    public void test(){
        List<CarPosition> all = carPositionService.All();
        System.out.println(all);


    }
    @Test
    public void test1(){
        Page<User> page = new Page<>(0,1);
        IPage<User> all = userService.all(page);
        List<User> records = all.getRecords();
        System.out.println(records);
    }
    @Test
    public void test2(){
        CarPosition carPosition = new CarPosition();
        CarArea carArea = new CarArea();
        carArea.setAreaName("areaName");
        carArea.setPrice(0F);




        carPosition.setPositionNo("positionNO");
        carPosition.setAddTime(new Date());
        carPosition.setIsactive(0L);

        boolean save = carPositionService.save(carPosition);

    }
}
