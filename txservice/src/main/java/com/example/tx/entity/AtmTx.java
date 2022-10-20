package com.example.tx.entity;

import java.time.LocalDateTime;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AtmTX")

public class AtmTx extends Tx {

	private int atmNo;
	private String location;
	public AtmTx() {
		super();
	}
	public AtmTx(float amount, boolean debit, LocalDateTime txTime, long accountId, int atmNo, String location) {
		super(amount, debit, txTime, accountId);
		this.atmNo = atmNo;
		this.location = location;
	}
	public int getAtmNo() {
		return atmNo;
	}
	public void setAtmNo(int atmNo) {
		this.atmNo = atmNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
