package br.dev.arthdroid1.exercises.exceptions.exercicio1.models.entities;

import br.dev.arthdroid1.exercises.exceptions.exercicio1.models.exceptions.InsufficientFundsException;
import br.dev.arthdroid1.exercises.exceptions.exercicio1.models.exceptions.WithdrawalLimitExceededException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}
	
	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	public void withdraw(Double amount) {
		if(balance == 0 ) {
			throw new InsufficientFundsException("Not enough balance");
		}
		if(amount > withDrawLimit ) {
			throw new WithdrawalLimitExceededException("The amount exceeds withdraw limit");
		}
		
		this.balance -= amount;
	}
	
	
	
}
