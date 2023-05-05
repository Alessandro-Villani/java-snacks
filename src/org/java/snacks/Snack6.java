package org.java.snacks;

import java.util.Random;
import java.util.Scanner;

public class Snack6 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci un valore limite");
		
		int limit = sc.nextInt();
		int sum = 0;
		Random rand = new Random();
		
		while(sum <= limit) {
			sum += rand.nextInt(101);
		}
		
		System.out.println("somma: " + sum + ", limite: " + limit);
		
		sc.close();
	}

}
