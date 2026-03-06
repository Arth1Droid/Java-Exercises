package br.dev.arthdroid1.exercises.io.exercicio1.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.dev.arthdroid1.exercises.io.exercicio1.models.entities.Product;

public class Main {
	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		List<Product> productList = new ArrayList<>();
		
		System.out.println("Adicione o caminho do arquivo: ");
		String path = sc.nextLine();
		
		File file = new File(path);
		String sourceFolder = file.getParent();
		
		boolean createFolderOrNot  = new File(sourceFolder + "/out").mkdir();
		
		String newFile = sourceFolder + "/out/summary.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String productCsv = br.readLine();
			while(productCsv != null) {
				String[] fields = productCsv.split(",");
				String name = fields[0];
				double price =  Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				productList.add(new Product(name,price,quantity));
				productCsv = br.readLine();
			}
			
			try(BufferedWriter bwr = new BufferedWriter(new FileWriter(newFile))){
				for (Product product : productList) {
					bwr.write(product.getName() + "," + product.totalValue());
					bwr.newLine();
				}
			} catch(IOException ex) {
				System.out.println("Error: " + ex.getMessage());
			}
			
		} catch(IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		
		
		sc.close();		
	}
}
