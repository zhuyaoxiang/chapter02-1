package com.didisapce01.chapter021.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Yaoxiang Zhu
 * @Description:
 */
@Data
@NoArgsConstructor
public class User2 {

    private Long id;
    private String name;
    private Integer age;

    public User2( String name, Integer age) {

        this.name = name;
        this.age = age;
    }
}
