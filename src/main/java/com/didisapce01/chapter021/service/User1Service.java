package com.didisapce01.chapter021.service;

import com.didisapce01.chapter021.entity.User1;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Yaoxiang Zhu
 * @Description:
 */
public interface User1Service {

    /**
     * 新增一个用户
     * @param name
     * @param age
     * @return
     */
    int create(String name,Integer age);

    /**查找用户
     *
     * @param name
     * @return
     */
    List<User1> getByName(String name);

    /**
     * 根据name删除用户
     * @param name
     * @return
     */
    int deleteByName(String name);

    /**
     * 获取用户总量
     * @return
     */
    int getAllUsers();

    /**
     * 删除所有用户
     * @return
     */
    int deleteAllUsers();
}
