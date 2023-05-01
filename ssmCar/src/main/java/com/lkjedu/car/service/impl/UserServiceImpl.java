package com.lkjedu.car.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lkjedu.car.beans.User;
import com.lkjedu.car.mapper.UserMapper;
import com.lkjedu.car.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int updateByID(User user) {
        return userMapper.updateByID(user);
    }

    @Override
    public Page<User> all(Page<User> page) {
        return userMapper.all(page);
    }
}
