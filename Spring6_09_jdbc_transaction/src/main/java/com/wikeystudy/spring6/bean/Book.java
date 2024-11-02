package com.wikeystudy.spring6.bean;

/**
 * @ Author：Wikey Cao
 * @ Date：02-11-2024
 * @ Description：
 */
public class Book {
    private int bookId;
    private String bookName;
    private int price;
    private int stock;

    // 无参构造函数
    public Book() {
    }

    // 全参构造函数
    public Book(int bookId, String bookName, int price, int stock) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.stock = stock;
    }

    // Getter和Setter方法
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // toString方法
    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}