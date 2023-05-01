package com.lkjedu.car.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lkjedu.car.beans.CarPosition;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarPositionService extends IService<CarPosition> {
    Page<CarPosition> all(Page<CarPosition> page);
    List<CarPosition> All();
    Boolean delById(Integer id);
    Boolean upDateById(@Param("pid") Integer pid,
                       @Param("areaId")Integer areaId,
                       @Param("positionNo") String positionNo,
                       @Param("isactive")Long isactive);


}
