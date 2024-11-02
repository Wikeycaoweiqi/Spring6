package com.wikeystudy.spring6.dao;

import com.wikeystudy.spring6.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @ Author：Wikey Cao
 * @ Date：02-11-2024
 * @ Description：
 */
@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Book queryBookByBookId(Integer bookId) {
        Object[] params = {bookId};
        String sql = "SELECT T.* FROM T_BOOK T WHERE BOOK_ID = ?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Book.class), params);
        return book;
    }

    @Override
    public void updateBookByBookId(Integer bookId) {
        Object[] params = {bookId};
        String sql = "UPDATE T_BOOK T SET T.STOCK = T.STOCK - 1 WHERE BOOK_ID = ?";
        jdbcTemplate.update(sql, params);
    }
}