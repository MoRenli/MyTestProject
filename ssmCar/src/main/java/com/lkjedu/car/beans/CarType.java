package com.lkjedu.car.beans;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("t_cartype")
@Data
public class CarType {
    private Integer id;
    @TableField("carTypeName")
    private String carTypeName;
}
