package br.dev.arthdroid1.exercises.logic.conditionals;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		String login;
		String senha;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu login: ");
		login = sc.nextLine();
		System.out.println("Digite a sua senha: ");
		senha = sc.nextLine();
		
		if(login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("1234")) {
			System.out.println("Login bem-sucedido");
		}
		else {
			System.out.println("Falha no login");
		}
	}

}
