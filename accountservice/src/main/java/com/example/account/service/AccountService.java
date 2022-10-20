package com.example.account.service;

import java.util.List;

import com.example.account.entity.Account;

public interface AccountService {

	Account createAccount(Account ac);

	Account updateAccount(Account ac);

	Account getAccount(Long id);

	List<Account> getAllAccounts();

	Account createSavingsAccount(double balance);

	Account createCurrentAccount(double balance);

}