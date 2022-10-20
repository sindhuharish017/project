package com.example.account.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.account.entity.Akshay;

@Repository
public interface AkshayRepo extends JpaRepository<Akshay, String> {

}
