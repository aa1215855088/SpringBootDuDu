package com.hnguigu.demo.service;

import com.hnguiug.demo.domain.Book;

import java.util.List;
import java.util.Map;

/**
 * @program: demo
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-09-02 17:38
 **/
public interface BookService {

    List<Book> listBook(Map<String, Object> map);

    int add(Book book);

    int delete(Integer[] ids);

    int update(Book book);
}
