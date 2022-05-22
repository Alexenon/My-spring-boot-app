package com.xenon.myspringbootapp.book;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "author")
    private String author;
    @Column(name = "gender")
    private String gender;

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

    @JsonSetter
    public void setId(int id) {
        this.id = id;
    }

    @JsonGetter
    public String getName() {
        return name;
    }

    @JsonSetter
    public void setName(String name) {
        this.name = name;
    }

    @JsonGetter
    public String getAuthor() {
        return author;
    }

    @JsonSetter
    public void setAuthor(String author) {
        this.author = author;
    }

    @JsonGetter
    public String getGender() {
        return gender;
    }

    @JsonSetter
    public void setGender(String gender) {
        this.gender = gender;
    }

}
