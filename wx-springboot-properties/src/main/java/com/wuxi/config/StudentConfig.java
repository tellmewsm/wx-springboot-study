package com.wuxi.config;

import com.wuxi.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName StudentConfig
 * @Description //TODO
 * @Author wuxi
 * @Date 2019-11-07 15:10
 * @Version 1.0
 **/
//等同于spring.xml配置，注入到容器
//@Configuration
public class StudentConfig {

    //给bean id student 设置属性
    //@Bean
    public Student student() {
        Student student = new Student();
        student.setNumber((long) 1003);
        student.setName("王五");
        student.setClasses("师范");
        return student;
    }
}
