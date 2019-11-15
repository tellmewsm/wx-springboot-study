package com.wuxi.controllar;

import com.wuxi.entity.User;
import com.wuxi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UserControllar
 * @Description //TODO
 * @Author wuxi
 * @Date 2019-11-01 13:52
 * @Version 1.0
 **/
@RestController
public class UserControllar {

    @Autowired
    private UserService userService;

    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * 返回list
     **/
    @GetMapping("/queryList")
    public List<Map<String, Object>> queryUsers() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from wx_User");
        return list;
    }

    //get http://localhost:8080/user
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> findAllUser() {
        return userService.findAllUser();

    }

    //get http://localhost:8080/user/1
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User findAllUser(@PathVariable("id") int id) {
        return userService.findUserById(id);

    }

    //delete http://localhost:8080/user/1
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public void deleteUserById(@PathVariable("id") int id) {
        userService.deleteUser(id);
    }

    //put http://localhost:8080/user
    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public void updateUserById(@RequestBody User user) {
        userService.updateUser(user);
    }

    //post http://localhost:8080/user
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public void saveOneUser(@RequestBody User user) {
        userService.saveUser(user);
    }

}
