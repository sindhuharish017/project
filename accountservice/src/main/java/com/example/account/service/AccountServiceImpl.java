package com.example.account.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.account.entity.Account;
import com.example.account.repo.accountRepo;

@Service
@Transactional(propagation=Propagation.SUPPORTS)
public class AccountServiceImpl implements AccountService {
	@Autowired
	private accountRepo accountrepo;
	
	private Account account;
	/* (non-Javadoc)
	 * @see com.example.account.service.AccountService#createAccount(com.example.account.entity.Account)
	 */
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Account createAccount(Account ac){
		return accountrepo.save(ac);
	}
	/* (non-Javadoc)
	 * @see com.example.account.service.AccountService#updateAccount(com.example.account.entity.Account)
	 */
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Account updateAccount(Account ac){
		return accountrepo.save(ac);
	}
	/* (non-Javadoc)
	 * @see com.example.account.service.AccountService#getAccount(java.lang.Long)
	 */
	@Override
	public Account getAccount(Long id){
		return accountrepo.findById(id).get();
	}
	/* (non-Javadoc)
	 * @see com.example.account.service.AccountService#getAllAccounts()
	 */
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public List<Account> getAllAccounts(){
		return accountrepo.findAll();
	}
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Account createSavingsAccount(double balance) {
		// TODO Auto-generated method stub
		account.setAcctype(Account.SAVINGS);
		account=new Account(account.getAcctype(),balance);
		return account;
	}
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Account createCurrentAccount(double balance) {
		// TODO Auto-generated method stub
		account.setAcctype(Account.CURRENT);
		account=new Account(account.getAcctype(),balance);
		return account;	}
}
