package com.didisapce01.chapter021.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Yaoxiang Zhu
 * @Description:
 */

@RestController
public class HelloController01 {
    @GetMapping("/")
    public String index(ModelMap map){
        map.addAttribute("host","http://blog.didispace01.com");
        return "index";
    }
}
