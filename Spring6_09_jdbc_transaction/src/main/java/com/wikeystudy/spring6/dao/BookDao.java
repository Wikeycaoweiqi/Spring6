package com.wikeystudy.spring6.dao;


import com.wikeystudy.spring6.bean.Book;

/**
 * @ Author：Wikey Cao
 * @ Date：02-11-2024
 * @ Description：
 */
public interface BookDao {

    Book queryBookByBookId(Integer bookId);

    void updateBookByBookId(Integer bookId);
}