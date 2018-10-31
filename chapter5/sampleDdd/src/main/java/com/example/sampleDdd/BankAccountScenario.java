package com.example.sampleDdd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// TODO: application layer
@Service
public class BankAccountScenario{
    @Autowired
    private BankAccountService queryService;

    @Autowired
    private BankAccountUpdateService updateService;

    public Amount withdraw(Amount amount){
        if(!queryService.canWithdraw(amount)){
            throw new IllegalStateException("lack of amount");
        }
        updateService.withdraw(amount);
        return queryService.balance();
    }
}