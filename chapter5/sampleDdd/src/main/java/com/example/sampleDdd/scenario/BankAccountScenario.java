package com.example.sampleDdd.scenario;

import com.example.sampleDdd.domain.Amount;
import com.example.sampleDdd.service.BankAccountService;
import com.example.sampleDdd.service.BankAccountUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountScenario {
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