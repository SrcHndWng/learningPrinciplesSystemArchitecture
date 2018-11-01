package com.example.sampleDdd.repository;

import com.example.sampleDdd.domain.Amount;

import org.springframework.stereotype.Repository;

@Repository
public class BankAccountDatasource implements BankAccountRepository{
    @Override
    public boolean canWithdraw(Amount amount) {
        // TODO: implement
        return true;
    }

    @Override
    public Amount balance() {
        // TODO: implement
        return new Amount(10000);
    }

    @Override
    public void withdraw(Amount amount) {
		// TODO: implement
        System.out.println("withdraw");
	}
}