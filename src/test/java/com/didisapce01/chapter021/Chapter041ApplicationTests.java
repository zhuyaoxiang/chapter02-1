package com.didisapce01.chapter021;

import com.didisapce01.chapter021.entity.User;
import com.didisapce01.chapter021.entity.User2;
import com.didisapce01.chapter021.mapper.User2Mapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Yaoxiang Zhu
 * @Description:
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter041ApplicationTests {
    @Autowired
    private User2Mapper user2Mapper;

    @Test
    @Rollback
    public void test() throws Exception{
        user2Mapper.insert("aaa",12);
        User2 user2 = user2Mapper.findByName("aaa");
        Assert.assertEquals(20, user2.getAge().intValue());
    }
}
