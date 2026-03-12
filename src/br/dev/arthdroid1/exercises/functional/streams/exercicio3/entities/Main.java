package br.dev.arthdroid1.exercises.functional.streams.exercicio3.entities;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees = List.of(
			new Employee("Maria", 3000.00),	
			new Employee("Carlos", 5000.00),	
			new Employee("Ana", 2500.00),
			new Employee("João", 5000.00),
			new Employee("Pedro", 8000.00)		
		);
		
		Optional<Double> segundoMaiorSalario = employees.stream()
			    .map(Employee::getSalary)          
			    .distinct()                        
			    .sorted(Comparator.reverseOrder()) 
			    .skip(1)                           
			    .findFirst();
		
		segundoMaiorSalario.ifPresent(salario -> {
		    System.out.println("O segundo maior salário é: R$ " + salario);
		
	    employees.stream()
        .filter(e -> e.getSalary() == salario)
        .map(Employee::getName)
        .forEach(nome -> System.out.println("Funcionário: " + nome));
		});
	}

}
