package br.dev.arthdroid1.exercises.oop.interfaces.exercicio1.services;

import java.time.LocalDate;

import br.dev.arthdroid1.exercises.oop.interfaces.exercicio1.models.entities.Contract;
import br.dev.arthdroid1.exercises.oop.interfaces.exercicio1.models.entities.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService() {
		
	}

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}



	public void processContract(Contract contract, int months) {
		
		double basicQuota = contract.getTotalValue() / months;
		
		for (int i = 0; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			double interest = onlinePaymentService.interest(basicQuota, i); 
			double fee = onlinePaymentService.paymentFree(basicQuota + interest);
			double quota = basicQuota + interest + fee;
			
			contract.getInstallment().add(new Installment(dueDate, quota));  
		}
		
	}
}
