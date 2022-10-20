package com.example.tx.entity;

import java.time.LocalDateTime;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TransferTX")

public class TransferTx extends Tx {

	private int fromacc;
	private int toacc;
	
	public TransferTx() {
		super();
	}
	
	public TransferTx(float amount, boolean debit, LocalDateTime txTime, long accountId, int fromacc, int toacc) {
		super(amount, debit, txTime, accountId);
		this.fromacc = fromacc;
		this.toacc = toacc;
	}

	public int getFromacc() {
		return fromacc;
	}
	public void setFromacc(int fromacc) {
		this.fromacc = fromacc;
	}
	public int getToacc() {
		return toacc;
	}
	public void setToacc(int toacc) {
		this.toacc = toacc;
	}
	
}
