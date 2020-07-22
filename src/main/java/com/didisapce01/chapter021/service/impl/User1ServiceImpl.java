package com.didisapce01.chapter021.service.impl;

import com.didisapce01.chapter021.entity.User1;
import com.didisapce01.chapter021.service.User1Service;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Yaoxiang Zhu
 * @Description:
 */
@Service
public class User1ServiceImpl implements User1Service {

    private JdbcTemplate jdbcTemplate;
    User1ServiceImpl(JdbcTemplate jdbcTemplate){
            this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int create(String name, Integer age) {
        return jdbcTemplate.update("INSERT INTO USER (NAME,AGE) VALUES(?,?)",name,age);
    }

    @Override
    public List<User1> getByName(String name) {
      List<User1> user1 = jdbcTemplate.query("select name ,age from user where name = ?",(resultSet,i) ->{
            User1 user11 = new User1();
            user11.setName(resultSet.getString("NAME"));
            user11.setAge(resultSet.getInt("AGE"));
            return user11;
      },name);
        return user1;
    }

    @Override
    public int deleteByName(String name) {

        return jdbcTemplate.update("delete from user where name =?",name);
    }

    @Override
    public int getAllUsers() {
        return jdbcTemplate.queryForObject("select count(1) from user",Integer.class);
    }

    @Override
    public int deleteAllUsers() {
        return jdbcTemplate.update("delete from user ");
    }
}
