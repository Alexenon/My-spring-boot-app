package book;

import com.fasterxml.jackson.annotation.JsonGetter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private final int id;
    @Column(name = "name")
    private final String name;
    @Column(name = "author")
    private final String author;
    @Column(name = "gender")
    private final String gender;

    public Book(int id, String name, String author, String gender) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.gender = gender;
    }

    @JsonGetter
    public int getId() {
        return id;
    }

    @JsonGetter
    public String getName() {
        return name;
    }

    @JsonGetter
    public String getAuthor() {
        return author;
    }

    @JsonGetter
    public String getGender() {
        return gender;
    }
}
