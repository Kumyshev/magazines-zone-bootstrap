package com.kumsyh.mapper;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.kumsyh.dto.AccountDto;
import com.kumsyh.model.Account;

@Component
public class AccountMapper {

    public Account toAccount(AccountDto accountDto) {
        return Account.builder()
                .name(accountDto.getName())
                .orders(new ArrayList<>())
                .build();
    }

    public AccountDto toAccountDto(Account account) {
        return AccountDto.builder()
                .name(account.getName())
                .build();
    }
}
