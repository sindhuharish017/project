package com.example.tx.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.tx.entity.Tx;

@Service
public interface TransactionService {

	Tx createTx(Tx tx);
	
	Tx getTxById(Long id);

	List<Tx> getTxByAll();


}