package com.lkjedu.car.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lkjedu.car.beans.User;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;


@MapperScan
public interface UserMapper extends BaseMapper<User> {
    int updateByID(User user);
    Page<User> all(Page<User> page);
}