package com.wuxi.contrallor;

import com.wuxi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DemoControllar
 * @Description //TODO
 * @Author wuxi
 * @Date 2019-10-30 15:42
 * @Version 1.0
 **/
@RestController
public class UserControllar {

    @Autowired
    User user;

    @RequestMapping("/user")
    public User testUserProperties() {

        return user;
    }

}
