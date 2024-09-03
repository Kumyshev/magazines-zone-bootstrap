package com.kumsyh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kumsyh.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
