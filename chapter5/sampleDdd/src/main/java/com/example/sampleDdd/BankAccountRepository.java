package com.example.sampleDdd;

import org.springframework.stereotype.Service;

@Service
public class BankAccountRepository{
    public Amount balance(){
        // TODO: implement
        return new Amount(10000);
    }

    public void withdraw(Amount amount){
        // TODO: implement
        System.out.println("withdraw");
    }
}