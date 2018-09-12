package com.hnguigu.demo.domain;

import java.io.Serializable;

/**
 * @program: demo
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-09-02 15:29
 **/
public class Book implements Serializable {

    private static final long serialVersionUID = 5310154819334409579L;

    /**
     * 图书ID
     */
    private int bookId;

    private String bookName;

    private Float bookPrice;

    private String bookAuthor;

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

    public Float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}


