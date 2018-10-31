package com.example.sampleDdd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// TODO:  application.service layer
@Service
class BankAccountUpdateService{
    @Autowired
    private BankAccountRepository repository;

    public void withdraw(Amount amount){
        repository.withdraw(amount);
    }
}