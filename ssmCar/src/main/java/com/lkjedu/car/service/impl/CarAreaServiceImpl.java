package com.lkjedu.car.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lkjedu.car.beans.CarArea;
import com.lkjedu.car.mapper.CarAreaMapper;
import com.lkjedu.car.service.CarAreaService;
import org.springframework.stereotype.Service;

@Service
public class CarAreaServiceImpl extends ServiceImpl<CarAreaMapper, CarArea> implements CarAreaService {
}
