package com.didisapce01.chapter021.entity;

import com.sun.istack.internal.NotNull;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

/**
 * @Author: Yaoxiang Zhu
 * @Description:
 */
@Data
@ApiModel(description = "用户实体")
public class Teacher {

    @ApiModelProperty("用户编号")
    private Long id;

    @NotNull
    @ApiModelProperty("用户姓名")
    private String name;

    @ApiModelProperty("用户姓名")
    private Integer age;

}
