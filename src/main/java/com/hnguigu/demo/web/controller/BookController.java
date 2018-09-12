package com.hnguigu.demo.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hnguiug.demo.domain.Book;
import com.hnguiug.demo.service.BookService;
import com.hnguiug.demo.tools.ServletUtil;
import com.hnguiug.demo.tools.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: demo
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-09-02 17:37
 **/
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("")
    public String leaen() {
        return "learn-resource";
    }

    @RequestMapping(value = "/listBook", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public void listBook(HttpServletRequest request, HttpServletResponse response) {
        String page = request.getParameter("page"); // 取得当前页数,注意这是jqgrid自身的参数
        String rows = request.getParameter("rows"); // 取得每页显示行数，,注意这是jqgrid自身的参数
        String bookAuthor = request.getParameter("bookAuthor");
        String bookName = request.getParameter("bookName");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("page", page);
        params.put("rows", rows);
        params.put("bookAuthor", bookAuthor);
        params.put("bookName", bookName);
        List<Book> learnList = bookService.listBook(params);
        PageInfo<Book> pageInfo = new PageInfo<Book>(learnList);
        JSONObject jo = new JSONObject();
        jo.put("rows", learnList);
        jo.put("total", pageInfo.getPages());//总页数
        jo.put("records", pageInfo.getTotal());//查询出的总记录数
        ServletUtil.createSuccessResponse(200, jo, response);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> add(Book book) {
        Map<String, Object> map = new HashMap<>();
        int index = this.bookService.add(book);

        if (index > 0) {
            map.put("message", "添加图书成功!");
            map.put("flag", true);
        } else {
            map.put("message", "添加图书失败!");
            map.put("flag", false);
        }

        return map;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(Integer[] ids, HttpServletResponse response) {

        JSONObject result = new JSONObject();
        //删除操作
        int index = this.bookService.delete(ids);
        if (index > 0) {
            result.put("message", "删除图书成功!");
            result.put("flag", true);
        } else {
            result.put("message", "删除图书失败!");
            result.put("flag", false);
        }
        ServletUtil.createSuccessResponse(200, result, response);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> update(Book book) {
        Map<String, Object> map = new HashMap<>();
        int index = this.bookService.update(book);

        if (index > 0) {
            map.put("message", "修改图书成功!");
            map.put("flag", true);
        } else {
            map.put("message", "修改图书失败!");
            map.put("flag", false);
        }

        return map;
    }
}
