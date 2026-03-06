package br.dev.arthdroid1.exercises.logic.conditionals;

import java.util.Scanner;

	public class Exercicio2 {
		public static void main(String[] args) {
			
			double nota;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite a nota: ");
			nota = sc.nextDouble();
			
			if(nota >= 7) {
				System.out.println("Aprovado");
			}
			else if (nota >= 5) {
				System.out.println("Recuperaçao");
			}
			else {
				System.out.println("reprovado");
			}
		}
}
