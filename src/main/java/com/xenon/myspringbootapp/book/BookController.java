package com.xenon.myspringbootapp.book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/books")
public class BookController {

    @GetMapping
    public List<Book> getBooks() {
        return List.of(
                new Book(1, "Dude in forest", "Bob Martin", "Adventures"),
                new Book(2, "Alice in Wonderlands", "Tow Sayer", "Children")
        );
    }

}
