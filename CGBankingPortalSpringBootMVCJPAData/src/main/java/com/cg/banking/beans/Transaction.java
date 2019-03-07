package com.cg.banking.beans;

import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int transactionId;
	private float amount;
	private String transactionType;
	@ManyToOne
	private Account account;
	
	public Transaction()
	{
		
	}
	
	
	public Transaction(int transactionId , float amount , String transactionType)
	{
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.transactionType = transactionType;
		
	}
	public Transaction(float amount, String transactionType , Account account)
	{
		super();
		this.account = account;
		this.amount = amount;
		this.transactionType = transactionType;
	}
	public Transaction(int transactionId, float amount, String transactionType, Account account) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.transactionType = transactionType;
		this.account = account;
	}



	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	

}
