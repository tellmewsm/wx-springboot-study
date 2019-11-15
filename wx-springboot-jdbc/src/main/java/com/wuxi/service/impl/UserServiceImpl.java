package com.wuxi.service.impl;

import com.wuxi.dao.UserDao;
import com.wuxi.entity.User;
import com.wuxi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description //TODO
 * @Author wuxi
 * @Date 2019-11-01 13:43
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }

    @Override
    public User findUserById(int id) {
        return userDao.findUserById(id);
    }

    @Override
    public Integer saveUser(User user) {
        return userDao.saveOneUser(user);
    }

    @Override
    public Integer updateUser(User user) {
        return userDao.updateUserById(user);
    }

    @Override
    public Integer deleteUser(int id) {
        return userDao.deleteUserById(id);
    }
}
