package com.hnguigu.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.hnguiug.demo.dao.BookMapper;
import com.hnguiug.demo.domain.Book;
import com.hnguiug.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @program: demo
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-09-02 17:39
 **/
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> listBook(Map<String, Object> map) {
        //设置分页条件
        PageHelper.startPage(Integer.parseInt(map.get("page").toString()), Integer.parseInt(map.get("rows").toString()));

        return this.bookMapper.listBook(map);
    }

    @Override
    public int add(Book book) {
        return this.bookMapper.add(book);
    }

    @Override
    public int delete(Integer[] ids) {
        return this.bookMapper.deleteByIds(ids);
    }

    @Override
    public int update(Book book) {
        return this.bookMapper.update(book);
    }
}
