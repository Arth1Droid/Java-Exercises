package br.dev.arthdroid1.exercises.logic.loops;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int condicao;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("-----MENU-----");
			System.out.println("1 - Iniciar");
		    System.out.println("2 - Ajuda");
		    System.out.println("3 - Sair");

		    System.out.println("Escolha uma opção: ");
		    condicao = sc.nextInt();
			
		} while (condicao != 3);
	}

}
