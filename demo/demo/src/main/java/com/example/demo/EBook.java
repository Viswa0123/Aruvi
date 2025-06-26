package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EBook implements Book {

    @Override
    public String getBookDetails() {
        return "EBook Title: Harry Potter";
    }
}
