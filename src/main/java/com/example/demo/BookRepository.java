package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class BookRepository {

    private ArrayList<Book> bookList;

    public BookRepository() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.bookList.add(book);
    }

    public ArrayList<Book> getBookList() {
        return this.bookList;
    }
}