package com.didisapce01.chapter021.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Yaoxiang Zhu
 * @Description:
 */
@Api(tags = {"教师管理","教学管理"})
@RestController
@RequestMapping(value = "/teacher")
public class TeacherController {
    @GetMapping("/xxx")
        public String xxx(){
        return "xxx";
    }
    }

