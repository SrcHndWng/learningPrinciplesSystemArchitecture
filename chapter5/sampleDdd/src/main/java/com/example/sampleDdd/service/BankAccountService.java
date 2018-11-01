package com.example.sampleDdd.service;

import com.example.sampleDdd.domain.Amount;
import com.example.sampleDdd.repository.BankAccountDatasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountService{
    @Autowired
    private BankAccountDatasource repository;

    public Amount balance(){
        return repository.balance();
    }

    public boolean canWithdraw(Amount amount){
        final Amount balance = balance();
        return balance.has(amount);
    }
}