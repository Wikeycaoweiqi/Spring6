package com.wikeystudy.spring6.service;

import com.wikeystudy.spring6.bean.Book;
import com.wikeystudy.spring6.dao.BookDao;
import com.wikeystudy.spring6.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;


/**
 * @ Author：Wikey Cao
 * @ Date：02-11-2024
 * @ Description：
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Autowired
    private UserDao userDao;

    @Transactional
//    @Transactional(readOnly = true)
//    @Transactional(timeout = 3)
    @Override
    public void buyBook(Integer userId, Integer bookId) {

//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        Book book = bookDao.queryBookByBookId(bookId);

        bookDao.updateBookByBookId(bookId);

        userDao.updateUserByUserId(userId, book.getPrice());
    }
}