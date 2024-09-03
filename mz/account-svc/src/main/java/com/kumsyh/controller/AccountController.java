package com.kumsyh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kumsyh.dto.AccountDto;
import com.kumsyh.impl.IAccountService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/api/v1/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final IAccountService accountService;

    @PostMapping
    public AccountDto saveAccount(@RequestBody AccountDto accountDto) {
        return accountService.saveAccount(accountDto);
    }

    @GetMapping
    public List<AccountDto> findAll() {
        int i=0;
        return accountService.findAll();
    }

}
