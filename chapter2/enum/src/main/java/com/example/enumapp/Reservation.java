package com.example.enumapp;

import java.util.ArrayList;
import java.util.List;

class Reservation{
    private List<Fee> fees;

    public Reservation(){
        fees = new ArrayList<Fee>();
    }

    public void addFee(Fee fee){
        fees.add(fee);
    }

    public Yen feeTotal(){
        Yen total = new Yen(0);
        for(Fee f : fees){
            total = total.add(f.yen());
        }
        return total;
    }
}