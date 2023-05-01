package com.lkjedu.car.controller;

import com.lkjedu.car.beans.CarArea;
import com.lkjedu.car.beans.CarPosition;
import com.lkjedu.car.beans.CarType;
import com.lkjedu.car.service.CarAreaService;
import com.lkjedu.car.service.CarPositionService;
import com.lkjedu.car.service.CarTypeService;
import com.mysql.cj.log.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
public class ControllerCarPositionManageCRUD {
    @Autowired
    private CarPositionService carPositionService;
    @Autowired
    private CarAreaService carAreaService;
    /**
     * 新增车位管理
     * */
    @RequestMapping("/spacemanager/spaceAddShow")
    public String spaceAddShow(HttpSession session){
        List<CarArea> carAreaList = carAreaService.list();
        session.setAttribute("carAreaList",carAreaList);
        return "car-space-add";
    }
    /**
     * /spacemanager/spaceAdd
     * spaceAdd():新增车位管理
     */
    @RequestMapping("/spacemanager/spaceAdd")
    public String spaceAdd(@RequestParam("carArea.id")Integer areaId, String positionNO, Long isactive){
        CarPosition carPosition = new CarPosition();
        carPosition.setAreaId(areaId);
        carPosition.setPositionNo(positionNO);
        carPosition.setAddTime(new Date());
        carPosition.setIsactive(isactive);
        boolean save = carPositionService.save(carPosition);
        return "car-space-manager";
    }
    /**
     * 根据id删除车位管理
     * */
    @RequestMapping("/spacemanager/spaceManagerDelete")
    public String spaceManagerDelete(Integer id){
        carPositionService.delById(id);
        return "car-space-manager";
    }
    /**
     * 根据id修改车位管理
     * */
    @RequestMapping("/spacemanager/updateShow")
    public String updateShow(@RequestParam("id")Integer id,HttpSession session){
        List<CarArea> carAreaList = carAreaService.list();
        List<CarPosition> carPosition = carPositionService.All();
        session.setAttribute("carAreaList",carAreaList);
        System.out.println(carAreaList);
        session.setAttribute("id",id);
        return "car-space-update";
    }
    /**
     * /spacemanager/spaceUpdate
     * spaceUpdate():根据id修改车位管理
     * */
    @RequestMapping("/spacemanager/spaceUpdate")
    public String spaceUpdate(@RequestParam("carArea.id") Integer id,
                              @RequestParam("positionNO")String positionNO,
                              @RequestParam("isactive") Long isactive,
                              HttpSession session){
        Integer pid = (Integer)session.getAttribute("id");
        Boolean aBoolean = carPositionService.upDateById(pid, id, positionNO, isactive);
        return "car-space-manager";
    }

}
