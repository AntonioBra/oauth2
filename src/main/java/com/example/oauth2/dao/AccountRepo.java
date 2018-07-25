package com.example.oauth2.dao;


import java.util.Optional;

import org.springframework.data.repository.Repository;

import com.example.oauth2.domain.Account;

public interface AccountRepo extends Repository<Account, Long> {
    Optional<Account> findByUsername(String username);
    Account save(Account account);
    int deleteAccountById(Long id);
}
