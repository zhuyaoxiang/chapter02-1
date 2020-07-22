package com.didisapce01.chapter021.entity;

import com.sun.istack.internal.NotNull;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: Yaoxiang Zhu
 * @Description:
 */
@Data
@ApiModel(description = "用户实体")
public class User  {
    @ApiModelProperty("用户编号")
    private Long id;

    @NotNull
    @ApiModelProperty("用户姓名")
    private String name;


    @NotNull
    @ApiModelProperty("用户年龄")
    private Integer age;
}
