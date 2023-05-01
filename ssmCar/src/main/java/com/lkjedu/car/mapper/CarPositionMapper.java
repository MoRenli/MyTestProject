package com.lkjedu.car.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lkjedu.car.beans.CarPosition;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
@MapperScan
public interface CarPositionMapper extends BaseMapper<CarPosition> {
    Page<CarPosition> all(Page<CarPosition> page);
    List<CarPosition> All();
    Boolean delById(@Param("id") Integer id);

    Boolean upDateById(@Param("pid") Integer pid,
                       @Param("areaId")Integer areaId,
                       @Param("positionNo") String positionNo,
                       @Param("isactive")Long isactive);
}
