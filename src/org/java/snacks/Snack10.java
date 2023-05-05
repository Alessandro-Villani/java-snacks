package org.java.snacks;

import java.util.Scanner;

public class Snack10 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci il raggio del cerchio");
		int radius = sc.nextInt();
		
		double area = Math.pow(radius, 2) * Math.PI;
		
		double perimeter = 2*radius * Math.PI;
		
		System.out.println("area: " + area);
		System.out.println("perimetro: " + perimeter);
		
		sc.close();

	}

}
