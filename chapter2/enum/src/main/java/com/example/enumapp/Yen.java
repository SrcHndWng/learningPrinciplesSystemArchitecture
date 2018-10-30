package com.example.enumapp;

class Yen{
    public final int value;

    public Yen(int value){
        this.value = value;
    }

    public Yen add(Yen other){
        int added = addValue(other);
        return new Yen(added);
    }

    private int addValue(Yen other){
        return this.value + other.value;
    }
}