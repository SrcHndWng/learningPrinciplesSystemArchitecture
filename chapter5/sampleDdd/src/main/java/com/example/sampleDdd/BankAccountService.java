package com.example.sampleDdd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// TODO: domain layer
@Service
public class BankAccountService{
    @Autowired
    private BankAccountRepository repository;

    public Amount balance(){
        return repository.balance();
    }

    public boolean canWithdraw(Amount amount){
        Amount balance = balance();
        return balance.has(amount);
    }
}