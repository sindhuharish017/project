package com.example.tx.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.tx.entity.Tx;
import com.example.tx.service.TransactionService;

@RestController
public class TxController {

	@Autowired
	private TransactionService transactionService;
	
	@PostMapping("/api/tx")
	public Tx createTx(@RequestBody Tx tx){
		return transactionService.createTx(tx);
	}
	@GetMapping("/api/tx/{id}")
	public Tx getTxById(long id){
		return transactionService.getTxById(id);
	}
	@GetMapping("/api/tx")
	public List<Tx> getTxByAll(){
		return transactionService.getTxByAll();
	}
	
}
