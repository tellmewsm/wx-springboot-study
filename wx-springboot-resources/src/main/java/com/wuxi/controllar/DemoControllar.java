package com.wuxi.controllar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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


    //修改测试devtools 修改类是否生效
    @RequestMapping("/hello1")
    @ResponseBody
    public String hello() {

        return "hello world1";
    }


}
