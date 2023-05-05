package org.java.snacks;

import java.util.Scanner;

public class Snack11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("inserisci un numero");
		int num = sc.nextInt();
		sc.close();
		
		for (int i = 1; i<Integer.MAX_VALUE; i++) {
			if(num % i == 0) {
				System.out.println(i);
			}
		}

	}

}
