package com.example.sampleDdd.repository;

import com.example.sampleDdd.domain.Amount;

import org.springframework.stereotype.Repository;

@Repository
interface BankAccountRepository{
    public boolean canWithdraw(Amount amount);
    public Amount balance();
    public void withdraw(Amount amount);
}
