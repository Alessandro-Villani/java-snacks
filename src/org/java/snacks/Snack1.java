package org.java.snacks;

import java.util.Scanner;

public class Snack1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insierisci un numero");
		
		int num = sc.nextInt();
		
		if (num % 2 != 0 ) {
			System.out.println(num);
		} else {
			System.out.println(num + 1);
		}

	}

}
