package br.dev.arthdroid1.exercises.logic.conditionals;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		int diaDaSemana;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número correspondente ao dia da semana: ");
		diaDaSemana = sc.nextInt();
		
		switch (diaDaSemana) {
		case 1 -> System.out.println("Domingo");
		case 2 -> System.out.println("Segunda-Feira");
		case 3 -> System.out.println("Terça-Feira");
		case 4 -> System.out.println("Quarta-Feira");
		case 5 -> System.out.println("Quinta-Feira");
		case 6 -> System.out.println("Sexta-Feira");
		case 7 -> System.out.println("Sábado");
		default-> System.out.println("O dia da semana não existe");
			
		}
	}
}
