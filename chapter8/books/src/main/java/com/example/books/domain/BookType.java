package com.example.books.domain;

public enum BookType{
    normal("normal book"),
    large("large book");

    private final String type;

    private BookType(String type) {
        this.type = type;
    }

    public String toString(){
        return type;
    }
}