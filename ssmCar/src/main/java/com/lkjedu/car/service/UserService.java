package com.lkjedu.car.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lkjedu.car.beans.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends IService<User> {
    int updateByID(User user);
    Page<User> all(Page<User> page);
}
