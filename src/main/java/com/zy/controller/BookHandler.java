package com.zy.controller;

import com.zy.entity.Book;
import com.zy.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ResponseBody
@Controller
@RequestMapping("/book")
public class BookHandler {

    @Autowired
    private BookRepository bookRepository;

    /*@GetMapping("/findAll")
    public List<Book> findAll(){
        List<Book> bookList = bookRepository.findAll();
        return bookList;
    }*/

    @GetMapping("/findAll/{page}/{size}")
    public Page<Book> findAll(@PathVariable("page")Integer page, @PathVariable("size") Integer size){
        //page:查询的页数（从0开始，所以-1）
        //size：每页显示的数量
        Pageable pageable = PageRequest.of(page-1,size) ;
        Page<Book> bookList = bookRepository.findAll(pageable);
        return bookList;
    }

    @PostMapping("/save")
    public String save(@RequestBody Book book){
        /*@RequestBody：主要用来接收前端传递给后端的json字符串中的数据
          GET方式无请求体，所以使用@RequestBody接收数据时，
          前端不能使用GET方式提交数据，而是用POST方式进行提交*/

        Book result = bookRepository.save(book);
        if (result != null){
            return "success";
        }else {
            return "error";
        }

    }

    @GetMapping("/findById/{id}")
    public Book findById(@PathVariable("id")Integer id){
        return bookRepository.findById(id).get();
    }

    @PostMapping("/update")
    //@PutMapping("/update")
    public String update(@RequestBody Book book){
        Book result = bookRepository.save(book);
        if (result != null){
            return "success";
        }else {
            return "error";
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        bookRepository.deleteById(id);
    }

}
