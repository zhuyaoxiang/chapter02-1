package com.didisapce01.chapter021.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Yaoxiang Zhu
 * @Description:
 */
@Api(tags = "HelloController")
@RestController
public class HelloController {

    @ApiOperation(value = "keep")
        @RequestMapping("/hello")
        public String index(){
            return "HelloController";
        }
}
