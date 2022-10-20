package com.example.tx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.tx.Repo.TxRepo;
import com.example.tx.entity.Tx;

@Service
@Transactional(propagation=Propagation.SUPPORTS)
public class TransctionServiceImpl implements TransactionService {

	@Autowired
	private TxRepo txrepo;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Tx createTx(Tx tx) {
		// TODO Auto-generated method stub
		return txrepo.save(tx) ;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Tx getTxById(Long id) {
		// TODO Auto-generated method stub
		return txrepo.findById(id).get();
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public List<Tx> getTxByAll() {
		// TODO Auto-generated method stub
		return txrepo.findAll();
	}

}
