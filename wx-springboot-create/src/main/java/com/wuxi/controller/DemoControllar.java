package com.wuxi.controller;

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
//@RestController
@Controller
public class DemoControllar {


    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {

        return "hello world！";
    }

}
