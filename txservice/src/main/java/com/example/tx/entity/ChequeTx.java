package com.example.tx.entity;

import java.time.LocalDateTime;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ChequeTX")

public class ChequeTx  extends Tx{

	private int chequeNo;
	private boolean outStation;
	private float collectionCharges;
	public ChequeTx() {
		super();
	}
	public ChequeTx(float amount, boolean debit, LocalDateTime txTime, long accountId, int chequeNo, boolean outStation,
			float collectionCharges) {
		super(amount, debit, txTime, accountId);
		this.chequeNo = chequeNo;
		this.outStation = outStation;
		this.collectionCharges = collectionCharges;
	}
	public int getChequeNo() {
		return chequeNo;
	}
	public void setChequeNo(int chequeNo) {
		chequeNo = chequeNo;
	}
	public boolean isOutStation() {
		return outStation;
	}
	public void setOutStation(boolean outStation) {
		this.outStation = outStation;
	}
	public float getCollectionCharges() {
		return collectionCharges;
	}
	public void setCollectionCharges(float collectionCharges) {
		this.collectionCharges = collectionCharges;
	}
	
}
