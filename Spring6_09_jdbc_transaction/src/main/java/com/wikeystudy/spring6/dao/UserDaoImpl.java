package com.wikeystudy.spring6.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @ Author：Wikey Cao
 * @ Date：02-11-2024
 * @ Description：
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void updateUserByUserId(Integer userId, int price) {
        Object[] params = {price, userId};
        String sql = "UPDATE T_USER T SET T.BALANCE = T.BALANCE - ? WHERE USER_ID = ?";
        jdbcTemplate.update(sql, params);
    }
}