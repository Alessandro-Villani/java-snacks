package org.java.snacks;

import java.util.Random;
import java.util.Scanner;

public class Snack5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		
		//VARS
		int userNum = sc.nextInt();
		int[] numbers = new int[userNum];
		int sum = 0;
		int evenSum = 0;
		int oddNumbers = 0;
		int oddSum = 0;
		
		for (int i = 0; i<numbers.length; i++) {
				Random rand = new Random();
				//ARRAY FILL
				numbers[i] = rand.nextInt(101);
				//SUM
				sum += numbers[i];
				//EVEN SUM
				if(numbers[i] % 2 == 0) {
					evenSum += numbers[i];
				}
				//ODD SUM
				else {
					oddSum += numbers[i];
					oddNumbers++;
				}
			}
		
		//AVERAGE
		double avg = (double) sum / numbers.length;
		//ODD NUMBERS AVERAGE
		double oddAvg = 0;
		if (oddNumbers > 0) {
			oddAvg = (double) oddSum / oddNumbers; 	
		}
		
		//MIN AND MAX
		int min = numbers[0];
		int max = numbers[0];
		
		for (int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
			if (numbers[i] < min) {
				min = numbers[i];
			}
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		
		System.out.println("somma: " + sum);
		System.out.println("somma pari: " + evenSum);
		System.out.println("media: " + avg);
		System.out.println("media dispari: " + oddAvg);
		System.out.println("minimo: " + min);
		System.out.println("massimo: " + max);
		
		sc.close();

	}

}
