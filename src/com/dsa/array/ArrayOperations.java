package com.dsa.array;

import java.util.Arrays;

public class ArrayOperations {
	
	public static void main(String... args) {
		int[] array = {1, 2, 4, 5, 6};
		System.out.println(Arrays.toString(insert(array, 3, 2)));
	}
	
	private static int[] insert(int[] array, int insertNum, int pos) {
		int[] temp = new int[array.length];
		
		for(int iterator = 0; iterator < array.length; iterator++) {
			if(iterator == pos) {
				temp[iterator] = insertNum;
			} else {
				temp[iterator] = array[iterator];
			}
		}
		
		return temp;
	}
}
