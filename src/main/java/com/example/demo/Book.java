package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Book {
    private String isbn;
    private String author;
    private String title;

}