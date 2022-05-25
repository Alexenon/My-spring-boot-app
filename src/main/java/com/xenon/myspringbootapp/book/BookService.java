package com.xenon.myspringbootapp.book;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    public List<Book> getBooks() {
        return List.of(
                new Book(1, "Dude in forest", "Bob Martin", "Adventures"),
                new Book(2, "Alice in Wonderlands", "Tow Sayer", "Children")
        );
    }

}
