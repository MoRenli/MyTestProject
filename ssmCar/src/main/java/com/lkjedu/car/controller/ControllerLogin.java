package com.lkjedu.car.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageInfo;
import com.lkjedu.car.beans.CarArea;
import com.lkjedu.car.beans.CarPosition;
import com.lkjedu.car.beans.CarType;
import com.lkjedu.car.beans.User;
import com.lkjedu.car.service.CarAreaService;
import com.lkjedu.car.service.CarPositionService;
import com.lkjedu.car.service.CarTypeService;
import com.lkjedu.car.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ControllerLogin {
    @Autowired
    private CarPositionService carPositionService;
    @Autowired
    private CarAreaService carAreaService;
    @Autowired
    private CarTypeService carTypeService;
    @Autowired
    private UserService userService;


    @RequestMapping({"/","login"})
    public String login(){
        return "login";
    }

//    登录页面
    @RequestMapping("/loginCheck")
    public String index(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username",username);
        wrapper.eq("password",password);
        User user = userService.getOne(wrapper);
        if (user != null){
            session.setAttribute("user",user);
            return "index";
        }else {
            System.out.println("登录失败");
            return "login";
        }
    }

    /**
     * 用户管理
     * */
    @RequestMapping("/userManagerFindAll")
    public String userManagerFindAll(HttpSession session){
        List<User> userList = userService.list();
        session.setAttribute("userList",userList);
        return "user-manager";
    }
    /**
     * 车辆类型管理
     * */
    @RequestMapping("/typeManagerFindAll")
    public String typeManagerFindAll(HttpSession session){
        List<CarType> carTypeList = carTypeService.list();
        session.setAttribute("carTypeList",carTypeList);
        return "car-type-manager";
    }

    /**
     * 停车区域管理
     * */
    @RequestMapping("/areamanager/findAll")
    public String areaManager(HttpSession session){
        List<CarArea> carAreaList = carAreaService.list();
        session.setAttribute("carAreaList",carAreaList);
        return "car-area-manager";
    }

    /**
     * 车位管理
     * */
    @RequestMapping("/spacemanager/findAll")
    public String spaceManager(@RequestParam(value = "currPage",defaultValue = "5") int currPage,
                               @RequestParam(value = "pageSize",defaultValue = "1")int pageSize,
                               HttpSession session){
        List<CarPosition> list = carPositionService.All();
        PageInfo<CarPosition> pageInfo = new PageInfo<>(list,currPage);
        session.setAttribute("pageInfo",pageInfo);
        return "car-space-manager";
    }

    /**
     * 停车场管理系统
     * /pages/index.jspex.jsp
     * */
    @RequestMapping("/bakeIndex")
    public String bakeIndex(){
        return "index";
    }


}
