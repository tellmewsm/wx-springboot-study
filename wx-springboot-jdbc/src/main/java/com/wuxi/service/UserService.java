package com.wuxi.service;

import com.wuxi.entity.User;
import java.util.List;

public interface UserService {

    List<User> findAllUser();

    User findUserById(int id);

    Integer saveUser(User user);

    Integer updateUser(User user);

    Integer deleteUser(int id);

}
