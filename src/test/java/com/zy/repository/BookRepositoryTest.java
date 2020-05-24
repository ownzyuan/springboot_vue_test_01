package com.zy.repository;

import com.zy.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    void testBook(){
        List<Book> bookList = bookRepository.findAll();
        bookList.forEach(System.out::println);
    }

    @Test
    void save(){
        Book book = new Book();
        book.setName("偷星九月天");
        book.setAuthor("周洪宾");
        Book newBook = bookRepository.save(book);
        System.out.println(newBook);
    }

    @Test
    void findById(){
        Book book = bookRepository.findById(1).get();
        System.out.println(book);
    }

    @Test
    void update(){
        Book book = new Book();
        book.setId(22);
        book.setName("测试书名");
        book.setAuthor("测试作者名");
        Book save = bookRepository.save(book);
        System.out.println(save);
    }

    @Test
    void delete(){
        bookRepository.deleteById(24);
    }

}