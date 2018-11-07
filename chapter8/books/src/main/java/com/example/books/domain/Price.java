package com.example.books.domain;

public class Price{
    private final int value;

    public Price(int value){
        this.value = value;
    }

    public String toString(){
        return String.format("%,d", value);
    }
}