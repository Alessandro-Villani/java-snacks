package org.java.snacks;

public class Snack3 {

	public static void main(String[] args) {
		
		int[] numbers = {3, 5, 18, 33, 72, 14, 27};
		
		int sum = 0;
		
		for (int i = 0; i<numbers.length; i++) {
			if(i % 2 != 0) {
				sum += numbers[i];
			}
		}
		
		System.out.println("somma: " + sum);
		
	}

}
