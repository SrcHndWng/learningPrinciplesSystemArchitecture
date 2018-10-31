package com.example.sampleDdd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// TODO: presentation layer
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