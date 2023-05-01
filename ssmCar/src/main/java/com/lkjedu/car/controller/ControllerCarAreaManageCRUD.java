package com.lkjedu.car.controller;

import com.lkjedu.car.beans.CarArea;
import com.lkjedu.car.service.CarAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class ControllerCarAreaManageCRUD {
    @Autowired
    private CarAreaService carAreaService;
    /**
     * 新建停车区域管理
     * */
    @RequestMapping("/carAreaAdd")
    public String carAreaAdd(){
        return "car-area-add";
    }
    /**
     * /areamanager/areaManagerAdd
     * areaManagerAdd()：新建停车区域管理
     */
    @RequestMapping("/areamanager/areaManagerAdd")
    public String areaManagerAdd(String areaName,Float price){
        CarArea carArea = new CarArea();
        carArea.setAreaName(areaName);
        carArea.setPrice(price);
        boolean save = carAreaService.save(carArea);
        return "car-area-manager";
    }
    /**
     * 根据id删除停车区域管理
     * areaManagerDelete():根据id删除
     * */
    @RequestMapping("/areamanager/areaManagerDelete")
    public String areaManagerDelete(Integer id){
        boolean b = carAreaService.removeById(id);
        return "car-area-manager";
    }
    /**
     * 根据id修改停车区域管理
     * */
    @RequestMapping("/areamanager/updateShow")
    public String updateShow(Integer carAreaId, HttpSession session){
        session.setAttribute("carAreaId",carAreaId);
        return "car-area-update";
    }
    /**
     * /areamanager/areaManagerUpdate
     * areaManagerUpdate():根据id修改停车区域管理
     * */
    @RequestMapping("/areamanager/areaManagerUpdate")
    public String areaManagerUpdate(String areaName,Float price,HttpSession session){
        Integer carAreaId = (Integer) session.getAttribute("carAreaId");
        CarArea carArea = new CarArea();
        carArea.setId(carAreaId);
        carArea.setAreaName(areaName);
        carArea.setPrice(price);
        System.out.println(carArea);
        boolean b = carAreaService.updateById(carArea);
        return "car-area-manager";
    }
}
