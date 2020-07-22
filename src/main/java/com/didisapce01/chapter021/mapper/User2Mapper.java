package com.didisapce01.chapter021.mapper;

import com.didisapce01.chapter021.entity.User;
import com.didisapce01.chapter021.entity.User2;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;

/**
 * @Author: Yaoxiang Zhu
 * @Description:
 */
@Mapper
public interface User2Mapper {
    /**
     *查询
     * @param name
     * @return
     */
    @Select("select * from user where name=#{}")
    User2 findByName(@Param("name") String name);

    /**
     * 插入
     * @param name
     * @param age
     * @return
     */
    @Insert("insert into user(name,age)values(#{name},#{age}) ")
    int insert(@Param("name")String name,@Param("age")Integer age);

}
