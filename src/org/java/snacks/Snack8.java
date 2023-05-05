package org.java.snacks;

import java.util.Arrays;
import java.util.Random;

public class Snack8 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] numbers = new int[10];
		
		System.out.println("Numeri estratti");
		for (int i = 0; i<10; i++) {
			numbers[i] = rand.nextInt(101);
			System.out.println(numbers[i]);
		}
		
		int countEven = 0;
		int countOdd = 0;
		
		for (int i = 0; i<numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				countEven += 1;
			} else {
				countOdd += 1;
			}
		}
		
		int[] evenNumbers = new int[countEven];
		int[] oddNumbers = new int[countOdd];
		int evenIndex = 0;
		int oddIndex = 0;
		
		for (int i = 0; i<numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				evenNumbers[evenIndex] = numbers[i];
				evenIndex++;
			} else {
				oddNumbers[oddIndex] = numbers[i];
				oddIndex++;
			}
		}
		
		System.out.println("Numeri pari");
		System.out.println(Arrays.toString(evenNumbers));
		
		System.out.println("Numeri dispari");
		System.out.println(Arrays.toString(oddNumbers));

	}

}
