package com.example.account.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.account.entity.Account;

@Repository
public interface accountRepo extends JpaRepository<Account, Long> {



}
