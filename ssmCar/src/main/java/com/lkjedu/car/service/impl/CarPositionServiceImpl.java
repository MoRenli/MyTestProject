package com.lkjedu.car.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lkjedu.car.beans.CarPosition;
import com.lkjedu.car.mapper.CarPositionMapper;
import com.lkjedu.car.service.CarPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarPositionServiceImpl extends ServiceImpl<CarPositionMapper, CarPosition> implements CarPositionService {
    @Autowired
    private CarPositionMapper carPositionMapper;

    @Override
    public Page<CarPosition> all(Page<CarPosition> page) {
        return carPositionMapper.all(page);
    }

    @Override
    public List<CarPosition> All() {
        return carPositionMapper.All();
    }

    @Override
    public Boolean delById(Integer id) {
        return carPositionMapper.delById(id);
    }

    @Override
    public Boolean upDateById(Integer pid, Integer areaId, String positionNo, Long isactive) {
        return carPositionMapper.upDateById(pid,areaId,positionNo,isactive);
    }

}
