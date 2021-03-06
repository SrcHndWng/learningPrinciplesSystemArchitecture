package com.example.sampleDdd.service;

import com.example.sampleDdd.domain.Amount;
import com.example.sampleDdd.repository.BankAccountDatasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountUpdateService{
    @Autowired
    private BankAccountDatasource repository;

    public void withdraw(Amount amount){
        repository.withdraw(amount);
    }
}