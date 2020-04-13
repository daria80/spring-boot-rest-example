package com.example.app.controllers;

import com.example.app.models.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/")
    public String index() {
        return "Hello,World!";
    }

    @GetMapping("/book")
    public Book book() {
        return new Book(1,"Thinking in java", "Bruce Ekkel", "Peter",2005,1900.0);
    }


}
