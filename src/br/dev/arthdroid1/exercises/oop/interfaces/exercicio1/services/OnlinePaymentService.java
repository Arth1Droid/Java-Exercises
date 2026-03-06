package br.dev.arthdroid1.exercises.oop.interfaces.exercicio1.services;

public interface OnlinePaymentService {
	
	public Double paymentFree(Double amount);
	public Double interest(Double amount, int months);
}
