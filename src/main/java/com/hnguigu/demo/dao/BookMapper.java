package com.hnguigu.demo.dao;

import com.hnguiug.demo.domain.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @program: demo
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-09-02 16:03
 **/
@Mapper
public interface BookMapper {

    List<Book> listBook(Map<String, Object> params);

    int
    add(Book book);

    int update(Book book);

    int deleteByIds(Integer[] ids);

    Book queryLearnResouceById(Long id);

    List<Book> queryLearnResouceList(Map<String, Object> params);
}

