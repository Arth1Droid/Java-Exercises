package br.dev.arthdroid1.exercises.functional.streams.exercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.dev.arthdroid1.exercises.functional.streams.exercicio1.entities.Employee;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the file path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
		}
		catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		System.out.println("Input the salary value :");
		double salaryValue = sc.nextDouble();
		
		List<String> emails = employees.stream().filter(e -> e.getSalary() > salaryValue)
				.map(Employee::getEmail)
				.sorted()
				.collect(Collectors.toList());
		
		double salarySum = employees.stream()
				.filter(e -> e.getName().toUpperCase().charAt(0) == 'M')
				.mapToDouble(Employee::getSalary)
				.sum();
				
		System.out.printf("Email of people whose salary is more than %.2f ", salaryValue);
		emails.forEach(System.out::println);
		
		System.out.println("Sum of salary of people whose name starts with 'M': " + salarySum);		
				
				
		sc.close();
		

	}

}
