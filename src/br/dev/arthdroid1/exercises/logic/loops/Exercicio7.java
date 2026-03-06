package br.dev.arthdroid1.exercises.logic.loops;

public class Exercicio7 {
	
	public static void main(String[] args) {
		int soma = 0;
		
		for (int i = 0; i <= 50; i++) {
			if(i % 2 == 0) {
				soma += i;
			}	
		}
		System.out.println("Total: " + soma);
	}
}
