package org.jayden.bean;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    @TableField(fill = FieldFill.INSERT)
    //execute when inserting
    private Date createTime;

    @TableField(fill = FieldFill.UPDATE)
    //execute when updating
    private Date updateTime;

}
