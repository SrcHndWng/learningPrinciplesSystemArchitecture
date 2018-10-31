package com.example.sampleDdd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BankAccountController {
    @GetMapping("/withdraw")
    @ResponseBody
    public Amount withdraw(@RequestParam(name="money", required=true) int money) {
        return new Amount(money);
    }

}