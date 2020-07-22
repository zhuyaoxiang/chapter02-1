package com.didisapce01.chapter021;

import com.didisapce01.chapter021.entity.User1;
import com.didisapce01.chapter021.service.User1Service;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: Yaoxiang Zhu
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter031ApplicationTests {


        @Autowired
        private User1Service user1Service;

        @Before
        public void setUp() {
            // 准备，清空user表
            user1Service.deleteAllUsers();
        }

        @Test
        public void test() throws Exception {
            // 插入5个用户
            user1Service.create("Tom", 10);
            user1Service.create("Mike", 11);
            user1Service.create("Didispace", 30);
            user1Service.create("Oscar", 21);
            user1Service.create("Linda", 17);

            // 查询名为Oscar的用户，判断年龄是否匹配
            List<User1> userList = user1Service.getByName("Oscar");
            Assert.assertEquals(21, userList.get(0).getAge().intValue());

            // 查数据库，应该有5个用户
            Assert.assertEquals(5, user1Service.getAllUsers());

            // 删除两个用户
            user1Service.deleteByName("Tom");
            user1Service.deleteByName("Mike");

            // 查数据库，应该有5个用户
            Assert.assertEquals(3, user1Service.getAllUsers());

        }

    }


