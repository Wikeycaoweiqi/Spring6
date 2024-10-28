package com.wikeystudy.spring6.bean;

/**
 * @ Author：Wikey Cao
 * @ Date：25-10-2024
 * @ Description：
 */
public class Book {
    private String name;
    private String author;
    private String others;

    public Book() {
    }

    public Book(String name, String author, String others) {
        this.name = name;
        this.author = author;
        this.others = others;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", others='" + others + '\'' +
                '}';
    }
}