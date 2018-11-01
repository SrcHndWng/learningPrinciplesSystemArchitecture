package com.example.sampleDdd.domain;

public class Amount{
    public final int value;

    public Amount(int value){
        this.value = value;
    }

    public boolean has(Amount amount){
        // TODO: use repository
        return (this.value >= amount.value);
    }
}