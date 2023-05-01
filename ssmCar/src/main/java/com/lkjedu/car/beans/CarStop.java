package com.lkjedu.car.beans;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@TableName("t_carstop")
@Data
public class CarStop {
    private Integer cid;
    private String carNumber;
    private CarType carTypeId;
    private CarPosition carPositionNo;
    private Date startTime;
    private Date endTime;
    private Float stopDuration;
    private Float stopCoat;
    private CarType price;

}
