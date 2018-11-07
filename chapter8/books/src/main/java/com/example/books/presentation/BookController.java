package com.example.books.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
    @GetMapping("/list")
    @ResponseBody
    public String list() {
        return "{name: 'sample1', price: 100}";
    }

}