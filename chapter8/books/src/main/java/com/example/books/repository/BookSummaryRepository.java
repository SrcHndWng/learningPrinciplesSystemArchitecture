package com.example.books.repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.books.domain.Auther;
import com.example.books.domain.BookSummary;
import com.example.books.domain.BookType;
import com.example.books.domain.Price;
import com.example.books.domain.Title;
import com.example.books.domain.LocalDate;

import org.springframework.stereotype.Repository;

@Repository
public class BookSummaryRepository{
    public List<BookSummary> getBookSummary() throws ParseException {
        List<BookSummary> books = new ArrayList<BookSummary>();

        Title title1 = new Title("title1");
        Price unitPrice1 = new Price(1000);
        LocalDate published1 = new LocalDate(createPublished("20180101"));
        Auther auther1 = new Auther("first1", "last1");
        BookType bookType1 = BookType.normal;
        books.add(new BookSummary(title1, unitPrice1, published1, auther1, bookType1));
        
        Title title2 = new Title("title2");
        Price unitPrice2 = new Price(2000);
        LocalDate published2 = new LocalDate(createPublished("20180202"));
        Auther auther2 = new Auther("first2", "last2");
        BookType bookType2 = BookType.large;
        books.add(new BookSummary(title2, unitPrice2, published2, auther2, bookType2));
        
        return books;
    }

    private Date createPublished(String value) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return sdf.parse(value);
    }
}