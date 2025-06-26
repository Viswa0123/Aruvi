package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class PrintedBook implements Book {

    @Override
    public String getBookDetails() {
        return "Printed Book Title: Harry Potter";
    }
}
