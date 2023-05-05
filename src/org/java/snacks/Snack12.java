package org.java.snacks;

import java.util.Arrays;

public class Snack12 {

	public static void main(String[] args) {

		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		int lng1 = arr1.length;
		int lng2 = arr2.length;
		
		Integer[] arrTot = new Integer[lng1 + lng2];
		int arrTotIndex = 0;
		
		for (int i = 0; i<lng1; i++) {
			arrTot[arrTotIndex++] = arr1[i];
		}
		
		for (int i = 0; i<lng2; i++) {
			arrTot[arrTotIndex++] = arr2[i];
		}

		System.out.println(Arrays.asList(arrTot));
		

	}

}
