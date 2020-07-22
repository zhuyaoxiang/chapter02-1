package com.didisapce01.chapter021.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Yaoxiang Zhu
 * @Description:
 */
@Api(tags = {"学生管理","教学管理"})
@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @ApiOperation("获取学生清单")
    @GetMapping("/list")
    public String bbb(){
        return "bbb";
    }

    @ApiOperation("获取某个学生的老师清单")
    @GetMapping("/his-teacher")
    public String ccc(){
        return "ccc";
    }

    @ApiOperation("创建一个学生")
    @PostMapping("/aaa")
    public String aaa(){
        return "aaa";
    }
}
