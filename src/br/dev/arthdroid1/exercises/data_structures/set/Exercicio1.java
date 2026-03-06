package br.dev.arthdroid1.exercises.data_structures.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> studentsId = new HashSet<>();
		
		System.out.println("How many students in course A ?");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%dº student id: ", i + 1);
			int id = sc.nextInt();
			studentsId.add(id);
		}
		
		System.out.println("How many students in course b?");
		 n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%dº student id: ", i + 1);
			int id = sc.nextInt();
			studentsId.add(id);
		}
		
		System.out.println("How many students in course c ?");
		 n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%dº student id: ", i + 1);
			int id = sc.nextInt();
			studentsId.add(id);
		}
		
		System.out.println("Total students: " + studentsId.size());
		
		sc.close();

	}

}
