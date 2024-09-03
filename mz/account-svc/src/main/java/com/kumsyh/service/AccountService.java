package com.kumsyh.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kumsyh.dto.AccountDto;
import com.kumsyh.impl.IAccountService;
import com.kumsyh.mapper.AccountMapper;
import com.kumsyh.repository.AccountRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountService implements IAccountService {

    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    @Override
    public AccountDto saveAccount(AccountDto accountDto) {
        return accountMapper.toAccountDto(accountRepository.save(
                accountMapper.toAccount(accountDto)));
    }

    @Override
    public List<AccountDto> findAll() {
        return accountRepository.findAll()
                .stream().map(accountMapper::toAccountDto)
                .toList();
    }

}
