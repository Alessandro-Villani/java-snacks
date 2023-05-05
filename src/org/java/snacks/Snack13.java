package org.java.snacks;

import java.util.Arrays;

public class Snack13 {

	public static void main(String[] args) {

		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		int lng1 = arr1.length;
		int lng2 = arr2.length;
		
		Integer[] arr3 = new Integer[lng1];
		Integer[] arr4 = new Integer[lng2];
		
		for(int i = 0; i<lng1; i++) {
			arr3[i] = arr1[i];
			if (i == 0) {
				arr3[i] = arr2[i];
			}
		}
		
		for(int i = 0; i<lng2; i++) {
			arr4[i] = arr2[i];
			if (i == 0) {
				arr4[i] = arr1[i];
			}
		}
		
		System.out.println(Arrays.asList(arr3));
		System.out.println(Arrays.asList(arr4));

	}

}
