package com.wuxi.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @ClassName Student
 * @Description //TODO
 * @Author wuxi
 * @Date 2019-11-07 13:33
 * @Version 1.0
 **/
@Component
@PropertySource({"classpath:student.properties"})
@ConfigurationProperties(prefix = "student")
public class Student {

    private Long number;
    private String name;
    private String classes;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
