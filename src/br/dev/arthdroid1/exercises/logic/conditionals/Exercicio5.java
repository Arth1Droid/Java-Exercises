package br.dev.arthdroid1.exercises.logic.conditionals;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero: ");
		numero = sc.nextInt();
		
		if(numero < 0) {
			System.out.println("Negativo");
		}
		else if(numero > 0) {
			System.out.println("Positivo");
		}
		else {
			System.out.println("Zero");
		}
	}
}
