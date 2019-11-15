package com.wuxi.dao;

import com.wuxi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @ClassName UserDao
 * @Description //TODO
 * @Author wuxi
 * @Date 2019-11-01 11:03
 * @Version 1.0
 **/
@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public List<User> findAllUser() {
        List<User> userList = jdbcTemplate.query("select * from wx_User", new Object[]{}, new BeanPropertyRowMapper(User.class));
        return userList;
    }

    //使用BeanPropertyRowMapper将实体类和数据库字段自动对应
    @Transactional
    public User findUserById(int id) {
        List<User> userList = jdbcTemplate.query("select * from wx_User where id = ?", new Object[]{id}, new BeanPropertyRowMapper(User.class));
        User user = null;
        if (!userList.isEmpty()) {
            user = userList.get(0);
        }
        return user;
    }

    @Transactional
    public int deleteUserById(int id) {

         return jdbcTemplate.update("DELETE from wx_User where id = ? ",id);

    }

    @Transactional
    public int updateUserById(User user) {
        return jdbcTemplate.update("UPDATE wx_User SET name = ? , description = ? WHERE id=?",
                user.getName(), user.getDescription(), user.getId());

    }


    @Transactional
    public int saveOneUser(User user) {
        return jdbcTemplate.update("insert into wx_User(id,name, description) values(?, ?, ?)",
                user.getId(),user.getName(), user.getDescription());

    }


}
