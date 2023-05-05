package org.java.snacks;

import java.util.Random;

public class Snack2 {

	public static void main(String[] args) {
		
		String[] names = {"Alessandro", "Pino", "Antonio", "Samuele", "Mindu"};
		String[] surnames = {"Villani", "Macrì", "Novelli", "Passiatore", "Sudaraka"};
		
		for (int i = 0; i<5; i++) {
			Random rand = new Random();
			int rand1 = rand.nextInt(names.length);
			int rand2 = rand.nextInt(surnames.length);
			System.out.println(names[rand1] + " " + surnames[rand2]);
		}

	}

}
