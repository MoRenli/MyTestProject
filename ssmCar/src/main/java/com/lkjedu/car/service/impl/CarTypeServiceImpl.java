package com.lkjedu.car.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lkjedu.car.beans.CarType;
import com.lkjedu.car.mapper.CarTypeMapper;
import com.lkjedu.car.service.CarTypeService;
import org.springframework.stereotype.Service;

@Service
public class CarTypeServiceImpl extends ServiceImpl<CarTypeMapper,CarType> implements CarTypeService {
}
