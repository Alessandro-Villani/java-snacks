package org.java.snacks;

import java.util.Random;

public class Snack7 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int num = rand.nextInt(101);
		
		while((num % 3 != 0) || (num % 5 != 0)) {
			num = rand.nextInt(101);
		}
		
		System.out.println(num);

	}

}
