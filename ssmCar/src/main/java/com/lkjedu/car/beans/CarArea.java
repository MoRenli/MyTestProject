package com.lkjedu.car.beans;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_cararea")
public class CarArea {
    private Integer id;
    @TableField("areaName")
    private String areaName;
    @TableField("price")
    private Float price;
}
