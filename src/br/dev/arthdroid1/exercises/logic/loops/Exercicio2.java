package br.dev.arthdroid1.exercises.logic.loops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio2 {
	public static void main(String[] args) {
		List<Integer> numero = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			numero.add(i);
		}
		Collections.reverse(numero);
		System.out.println(numero);
	}
}
