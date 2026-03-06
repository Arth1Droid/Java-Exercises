package br.dev.arthdroid1.exercises.logic.loops;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = -1;
		
		while (numero != 0) {
			
			System.out.println("Digite um numero:" );
			 numero = scanner.nextInt();
			 
			 if(numero == 0) {
				 System.out.println("Encerrando...");
			 }
		}
	}
}
