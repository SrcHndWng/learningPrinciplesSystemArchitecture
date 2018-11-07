package com.example.books.domain;

public class Auther{
    final private String firstName;
    final private String lastName;

    public Auther(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString(){
        return firstName + ", " + lastName;
    }
}