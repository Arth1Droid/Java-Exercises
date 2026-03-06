package br.dev.arthdroid1.exercises.logic.conditionals;

public class Exercicio6 {
	public static void main(String[] args) {
		
		int idade = 18;
		boolean temCarteira = true;
		
//		int idade = 18;
//		boolean temCarteira = false;
		
//		int idade = 17;
//		boolean temCarteira = false;
		
		if(idade>=18 && temCarteira) {
			System.out.println("Pode dirigir");
		}
		else {
			System.out.println("Não pode dirigir");
		}
		
	}
}
