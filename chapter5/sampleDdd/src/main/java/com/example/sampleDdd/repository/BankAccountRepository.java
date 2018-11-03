package com.example.sampleDdd.repository;

import com.example.sampleDdd.domain.Amount;

import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepository{
    public Amount balance();
    public void withdraw(Amount amount);
}
