package com.cloudveo.librarybase.main.controller;


import com.cloudveo.librarybase.main.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private Book testBook = new Book("Adam Kay","Bedzie bolalo");
    private Book testBook2 = new Book(System.getProperty("author"),System.getProperty("name"));

    @GetMapping("/book")
    public Book getBook(){
        return testBook2;
    }



}
