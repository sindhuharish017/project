package com.example.account.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;



@Entity
public class Account {

	public static final String SAVINGS="SB";
	public static final String CURRENT="CB";
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String acctype;
	private double balance;
	private LocalDateTime creationDate;
	private LocalDateTime lastUpdateDate;
	private boolean active;
	
	
	@ManyToMany(targetEntity = Customer.class, cascade = { CascadeType.MERGE,	CascadeType.PERSIST })
	@JoinTable(name="Customer_account",joinColumns = @JoinColumn(name="account_id",referencedColumnName="id"), inverseJoinColumns = @JoinColumn(name="customer_id",referencedColumnName="id"))
	private Set<Customer> customers;

	
	
	public Account() {
		super();
	}

	public Account(long id, String acctype, double balance, LocalDateTime creationDate, LocalDateTime lastUpdateDate,
			boolean active) {
		super();
		this.id = id;
		this.acctype = acctype;
		this.balance = balance;
		this.creationDate = creationDate;
		this.lastUpdateDate = lastUpdateDate;
		this.active = true;
	}

	public Account(String acctype, double balance) {
		super();
		this.acctype = acctype;
		this.balance = balance;
		this.creationDate=LocalDateTime.now();
		this.lastUpdateDate=LocalDateTime.now();
		this.active=true;
	}
	
	
	public Set<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public LocalDateTime getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}
	public LocalDateTime getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(LocalDateTime lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	

}
