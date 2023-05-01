package com.lkjedu.car.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lkjedu.car.beans.CarType;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface CarTypeMapper extends BaseMapper<CarType> {
}
