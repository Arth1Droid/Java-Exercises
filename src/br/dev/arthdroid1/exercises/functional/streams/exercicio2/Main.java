package br.dev.arthdroid1.exercises.functional.streams.exercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


import br.dev.arthdroid1.exercises.functional.streams.exercicio2.entities.Product;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<>();
		
		System.out.println("Enter the file path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line !=null) {
				String[] fields = line.split(",");
				products.add(new Product(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
		}
		catch(IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		
		System.out.println("Input a category: ");
		String category = sc.nextLine();
		
		List<Product> filteredProducts = products.stream().filter(p -> p.getCategory().equalsIgnoreCase(category))
				.sorted(Comparator.comparingDouble(Product::getPrice).reversed()).toList();
		
		double averagePrice = products.stream()
			    .mapToDouble(Product::getPrice)
			    .average()
			    .orElse(0.0);
		
		filteredProducts.forEach(System.out::println);
		System.out.printf("Price average: %.2f", averagePrice);
		
		sc.close();

	}

}
