package com.wuxi.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @ClassName User
 * @Description //TODO
 * @Author wuxi
 * @Date 2019-11-01 10:17
 * @Version 1.0
 **/
@Component
//@ConfigurationProperties(prefix = "user")
public class User {

    @Value("${User.id}")
    private int id;

    @Value("${User.name}")
    private String name;

    @Value("${User.description}")
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
