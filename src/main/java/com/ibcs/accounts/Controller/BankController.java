package com.ibcs.accounts.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankController {
    @GetMapping(value = "/bankName")
    public String bankName() {
        return "Pubali bank limited";
    }
}
