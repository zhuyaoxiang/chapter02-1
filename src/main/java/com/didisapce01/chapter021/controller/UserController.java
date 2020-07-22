package com.didisapce01.chapter021.controller;

import com.didisapce01.chapter021.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @Author: Yaoxiang Zhu
 * @Description:
 */
@Api(tags = "用户管理")
@RestController
@RequestMapping(value="/users")//通过这里的配置使下方的映射都在/user下
public class UserController {
    /**
     *创建线程安全的Map模拟user信息的存储
     */
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long,User>());

    /**
     * 处理"/Users/的请求，用来获取用户列表"
     * @return
     */
    @GetMapping("/")
    @ApiOperation(value = "获取用户列表")
    public List<User> getUserList(){
        List<User> r = new ArrayList<User>(users.values());
        return r;

    }

    /**处理"/users/"的post请求，用来创建User
     * @param user
     *
     * @return
     */
    @PostMapping("/")
    @ApiOperation(value = "创建用户",notes = "根据user对象创建用户")
    public String postUser( @RequestBody User user){
        //@RequestBody注解用来绑定通过http请求中的application/json类型上的数据
        users.put(user.getId(),user);
        return "success";
    }

    /**
     * 处理"/users/{id}"的get请求，用来获取url中id值的user信息
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "创建用户",notes = "根据user对象创建用户")
    public User getUser(@PathVariable Long id){
        return users.get(id);
    }

    /**
     *
     * @param id
     * @param user
     * @return
     */
    @PutMapping("/{id}")
    @ApiImplicitParam(paramType = "path", dataType = "Long", name = "id", value = "用户编号", required = true, example = "1")
    @ApiOperation(value = "更新用户详细信息",notes = "根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    public String putUser(@PathVariable long id,User user){
        User u = users.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id,u);
        return "success";
    }

    /**
     * 处理"/users/{id}"的DELETE请求，用来删除User
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除用户",notes = "根据url的id来指定删除对象")
    public String deleteUser(@PathVariable Long id){
        users.remove(id);
        return "success";

    }





}
