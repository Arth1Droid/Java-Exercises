package br.dev.arthdroid1.exercises.logic.loops;

public class Exercicio6 {
	
	public static void main(String[] args) {
		String[] nomes = {"Arthur", "ArthDroid1", "Artwa", "Chopper", "Artika"};
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
	}
}
