package br.dev.arthdroid1.exercises.oop.interfaces.exercicio1.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import br.dev.arthdroid1.exercises.oop.interfaces.exercicio1.models.entities.Contract;
import br.dev.arthdroid1.exercises.oop.interfaces.exercicio1.models.entities.Installment;
import br.dev.arthdroid1.exercises.oop.interfaces.exercicio1.services.ContractService;
import br.dev.arthdroid1.exercises.oop.interfaces.exercicio1.services.PaypalService;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter the contract data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next());
		System.out.println("Contract value: ");
		double contractValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, contractValue);
		
		System.out.println("Enter the number of installments: ");
		int installments = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(contract, installments);
		
		System.out.println("Installments: ");
		for (Installment installment : contract.getInstallment()) {
			System.out.println(installment);
		}
		
		sc.close();

	}

}
