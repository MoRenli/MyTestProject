package com.lkjedu.car.controller;

import com.lkjedu.car.beans.CarType;
import com.lkjedu.car.service.CarTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class ControllerCarTypeManageCRUD {
    @Autowired
    private CarTypeService carTypeService;
    /**
     * 添加用户
     * */
    @RequestMapping("/carTypeAdd")
    public String carTypeAdd(){
        return "car-type-add";
    }
    /**
     * /typemanager/typeManagerAdd
     * typeManagerAdd()：添加车辆管理类型
     * */
    @RequestMapping("/typemanager/typeManagerAdd")
    public String typeManagerAdd(String carTypeName){
        CarType carType = new CarType();
        carType.setCarTypeName(carTypeName);
        boolean save = carTypeService.save(carType);
        return "car-type-manager";
    }
    /**
     * 根据id删除车辆类型名称
     * */
    @RequestMapping("/typemanager/typeManagerDelete")
    public String typeManagerDelete(Integer id){
        boolean b = carTypeService.removeById(id);
        return "car-type-manager";
    }
    /**
     * 根据id修改车辆类型名称
     * */
    @RequestMapping("/typemanager/updateShow")
    public String updateShow(Integer carTypeId, HttpSession session){
        session.setAttribute("carTypeId",carTypeId);
        return "car-type-update";
    }
    /**
     * /typemanager/typeManagerUpdate
     * typeManagerUpdate():根据id修改车辆类型名称
     * */
    @RequestMapping("/typemanager/typeManagerUpdate")
    public String typeManagerUpdate(String carTypeName,HttpSession session){
        Integer carTypeId = (Integer) session.getAttribute("carTypeId");
        CarType carType = new CarType();
        carType.setId(carTypeId);
        carType.setCarTypeName(carTypeName);
        System.out.println(carType);
        boolean b = carTypeService.updateById(carType);
        return "car-type-manager";
    }

}
