package br.dev.arthdroid1.exercises.exceptions.exercicio1.application;

import java.util.Scanner;

import br.dev.arthdroid1.exercises.exceptions.exercicio1.models.entities.Account;
import br.dev.arthdroid1.exercises.exceptions.exercicio1.models.exceptions.InsufficientFundsException;
import br.dev.arthdroid1.exercises.exceptions.exercicio1.models.exceptions.WithdrawalLimitExceededException;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		 System.out.println("Enter the Account data");
		 System.out.print("Number: ");
		 int number = sc.nextInt();
		 System.out.print("Holder: ");
		 sc.nextLine();
		 String holder = sc.nextLine();
		 System.out.print("Initial balance: ");
		 double balance = sc.nextDouble();
		 System.out.print("Withdraw limit: ");
		 double withdrawLimit = sc.nextDouble();
		 
		 Account ac = new Account(number, holder, balance, withdrawLimit);
		
		 System.out.println("Enter amount for withdraw: ");
		 double amount = sc.nextDouble();
		 
		try {
			ac.withdraw(amount);
			System.out.printf("New balance: %.2f%n ", ac.getBalance());
		}
		catch(InsufficientFundsException e){
			e.getMessage();
		}
		catch(WithdrawalLimitExceededException e) {
			e.getMessage();
		}
		
		sc.close();
	}

}
