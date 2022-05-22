package com.xenon.myspringbootapp;

import book.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class MySpringBootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootAppApplication.class, args);
    }

    @GetMapping
    public List<Book> hello() {
        return List.of(
                new Book(1, "Dude in forest", "Bob Martin", "Adventures"),
                new Book(2, "Alice in Wonderlands", "Tow Sayer", "Children")
        );

    }

}
