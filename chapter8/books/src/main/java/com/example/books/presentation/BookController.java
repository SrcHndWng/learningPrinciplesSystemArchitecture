package com.example.books.presentation;

import java.text.ParseException;
import java.util.List;

import com.example.books.domain.BookSummary;
import com.example.books.repository.BookSummaryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
    @Autowired
    private BookSummaryRepository repository;

    @GetMapping("/list")
    @ResponseBody
    public String list() throws ParseException {
        List<BookSummary> books = repository.getBookSummary();
		books.forEach(b -> {
			System.out.println(b.toString());
		});
        return "{name: 'sample1', price: 100}";
    }

}