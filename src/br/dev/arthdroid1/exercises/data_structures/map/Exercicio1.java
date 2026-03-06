package br.dev.arthdroid1.exercises.data_structures.map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> voteRecords = new HashMap<>();
		System.out.println("Type the file full path: ");
		String path = sc.nextLine();
		
		
		try(BufferedReader br = new BufferedReader( new FileReader(path))){
			String line = br.readLine();
			while(line !=null) {
				String[] fields =  line.split(",");
				
				String name = fields[0];
				Integer votes = Integer.parseInt(fields[1]);
				
				if (voteRecords.containsKey(name)) {
			        int currentVotes = voteRecords.get(name);
			        voteRecords.put(name, currentVotes + votes);
			    } else {
			        voteRecords.put(name, votes);
			    }
				line = br.readLine(); 
			}
		}
		catch(IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		
		System.out.println(voteRecords);
	}

}
