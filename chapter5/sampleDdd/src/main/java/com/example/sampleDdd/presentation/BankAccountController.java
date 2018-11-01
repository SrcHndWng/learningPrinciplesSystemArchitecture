package com.example.sampleDdd.presentation;

import com.example.sampleDdd.domain.Amount;
import com.example.sampleDdd.scenario.BankAccountScenario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BankAccountController {
    @Autowired
    private BankAccountScenario bankAccountScenario;

    @GetMapping("/withdraw")
    @ResponseBody
    public Amount withdraw(@RequestParam(name="money", required=true) int money) {
        final Amount amount = new Amount(money);
        return bankAccountScenario.withdraw(amount);
    }

}