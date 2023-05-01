package com.lkjedu.car.beans;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("t_user")
public class User {
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;
    @TableField("userName")
    private String userName;
    private String password;
    @TableField("trueName")
    private String trueName;
}
