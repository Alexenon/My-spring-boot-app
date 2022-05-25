package com.xenon.myspringbootapp.book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BookConfig {

    @Bean
    CommandLineRunner commandLineRunner(BookRepository repository) {
        return args -> {

            Book harryPotter = new Book(
                    1,
                    "Harry Potter",
                    "J.K. Rowling",
                    "Adventures"
            );

            Book aliceInWonderland = new Book(
                    2,
                    "Alice in Wonderlands",
                    "Tow Sayer",
                    "Children"
            );

            repository.saveAll(
                    List.of(harryPotter, aliceInWonderland)
            );
        };
    }

}
