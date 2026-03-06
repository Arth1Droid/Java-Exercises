package br.dev.arthdroid1.exercises.oop.composition.exercicio1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.dev.arthdroid1.exercises.oop.composition.exercicio1.entities.Department;
import br.dev.arthdroid1.exercises.oop.composition.exercicio1.entities.HourContract;
import br.dev.arthdroid1.exercises.oop.composition.exercicio1.entities.Worker;
import br.dev.arthdroid1.exercises.oop.composition.exercicio1.entities.enums.WorkerLevel;

public class main {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter the department name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker name: ");
		String workerName = sc.nextLine();
		System.out.println("Level: ");
		String workerLevel = sc.nextLine();
		System.out.println("Base salary: ");
		Double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.println("How many contracts to this worker? ");
		int x = sc.nextInt();
		
		for (int i = 0; i <=x; i++) {
			System.out.printf("Enter contract #%d data: ", x);
			System.out.print("Date (DD/MM/YYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.println("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);	
			worker.addContract(contract);
	
		}
		
		System.out.println();
		System.out.println("Enter month and year to calculate income (MM/yyyy): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(0,3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + worker.income(year, month));
		
		
		sc.close();	
	}
}
