package com.example.books.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LocalDate {
    private final Date value;

    public LocalDate(Date value){
        this.value = value;
    }

    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(value);
    }
}