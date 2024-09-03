package com.kumsyh.impl;

import java.util.List;

import com.kumsyh.dto.AccountDto;


public interface IAccountService {

    public AccountDto saveAccount(AccountDto account);

    public List<AccountDto> findAll();
}
