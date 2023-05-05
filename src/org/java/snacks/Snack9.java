package org.java.snacks;

import java.util.Scanner;

public class Snack9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci la base del rettangolo");
		int b = sc.nextInt();
		System.out.println("inserisci l'altezza del rettangolo");
		int h = sc.nextInt();
		
		int area = b*h;
		
		int perimeter = 2*(b + h);
		
		System.out.println("area: " + area);
		System.out.println("perimetro: " + perimeter);
		
		sc.close();

	}

}
