package com.example.tx.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tx.entity.Tx;

@Repository
public interface TxRepo extends JpaRepository<Tx, Long>{

	
}
