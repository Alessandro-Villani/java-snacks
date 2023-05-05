package org.java.snacks;

import java.util.Scanner;

public class Snack4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci una frase");
		String sentence = sc.nextLine();
		sc.close();
		String reverseSentence = "";
		
		for (int i = sentence.length() - 1; i > -1; i--) {
			reverseSentence += sentence.charAt(i);
		}
		
		if (sentence.equals(reverseSentence)) { 
			System.out.println("La frase " + sentence + " è palindroma"); 
			}
		else {
			System.out.println("La frase " + sentence + " non è palindroma");
			}

	}

}
