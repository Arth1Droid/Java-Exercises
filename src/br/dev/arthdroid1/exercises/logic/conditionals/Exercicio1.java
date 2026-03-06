package br.dev.arthdroid1.exercises.logic.conditionals;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		int idade;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a idade: ");
		idade = sc.nextInt();
		
		if(idade < 18) {
			System.out.println("Menor de Idade");
		}
		else if (idade <= 59) {
			System.out.println("Adulto");
		}
		else {
			System.out.println("Idoso");
		}
	}

}
