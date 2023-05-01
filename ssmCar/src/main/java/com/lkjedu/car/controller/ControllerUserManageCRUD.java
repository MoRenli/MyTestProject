package com.lkjedu.car.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.lkjedu.car.beans.User;
import com.lkjedu.car.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class ControllerUserManageCRUD {
    @Autowired
    private UserService userService;
    /**
     * /userManagerAdd
     * userManagerAdd()：添加用户
     * */

    @RequestMapping("/userAdd")
    public String userAdd(){
        return "user-manager-add";
    }
    @RequestMapping("/userManagerAdd")
    public String userManagerAdd(String userName,String password,String trueName){
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        user.setTrueName(trueName);
        if (userService.save(user) == true){
            return "user-manager";
        }else {
            return "user-manager-add";
        }
    }

    /***
     * /userManagerDelete
     * userManagerDelete():根据id删除用户
     */
    @RequestMapping("/userManagerDelete")
    public String userManagerDelete(Integer id){
        boolean b = userService.removeById(id);
        return "user-manager";
    }

    @RequestMapping("/userManagerUpdateShow")
    public String userManagerUpdateShow(@RequestParam("id")Integer id, HttpSession session){
        session.setAttribute("id",id);
        return "user-manager-update";
    }

    /**
     * /userManagerUpdate
     * /userManagerUpdate():根据id修改用户
     * */
    @RequestMapping("/userManagerUpdate")
    public String userManagerUpdate(String userName, String password, String trueName,HttpSession session){
        Integer id = (Integer) session.getAttribute("id");
        User user = new User();
        user.setId(id);
        user.setUserName(userName);
        user.setPassword(password);
        user.setTrueName(trueName);

        boolean b = userService.updateById(user);
        return "user-manager";
    }
}
