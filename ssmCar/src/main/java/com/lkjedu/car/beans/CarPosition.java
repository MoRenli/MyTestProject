package com.lkjedu.car.beans;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@TableName("t_carposition")
@Data
public class CarPosition {
    private Integer pid;

    @TableField("areaId")
    private Integer areaId;

    @TableField("positionNo")
    private String positionNo;

    @TableField("addTime")
    private Date addTime;

    @TableField("isactive")
    private Long isactive;

    @TableField(exist = false)
    private CarArea carArea;

}
