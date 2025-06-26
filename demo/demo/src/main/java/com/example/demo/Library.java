package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Library {

    private Book book;

    @Autowired
    public Library(@Qualifier("printedBook") Book book) {
        this.book = book;
    }

    public void showBookDetails() {
        System.out.println(book.getBookDetails());
    }
}
