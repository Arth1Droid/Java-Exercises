package br.dev.arthdroid1.exercises.oop.interfaces.exercicio1.services;

public class PaypalService implements OnlinePaymentService {
	
	public PaypalService() {
		
	}
	@Override
	public Double paymentFree(Double amount) {
		double paymentFee = amount * 0.02;
		return paymentFee;
	}

	@Override
	public Double interest(Double amount, int months) {
		double interest = amount * 0.01 * months;
		return interest;
	}

}
