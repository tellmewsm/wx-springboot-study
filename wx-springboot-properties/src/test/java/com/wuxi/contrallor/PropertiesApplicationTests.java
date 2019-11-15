package com.wuxi.contrallor;

import com.wuxi.entity.Student;
import com.wuxi.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PropertiesApplicationTests {


    @Autowired
    User user;

    @Autowired
    Student student;

    @Test
    void contextLoads() {

        System.out.println(user);
        System.out.println(student);

    }


}
