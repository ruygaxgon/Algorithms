package com.dsa.search;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Ruy
 *
 * The complexity is of O(n), requires n comparisons for n items, 
 * It performs as n/2, linear performance.
 * 
 */
public class LinearSearch {

	public static void main(String[] args) {
		askForInput();
	}
	
	private static void askForInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert an array of numbers separated by comma:");
		String stringArray = scanner.nextLine();
		System.out.println("Insert a number to search in the array:");
		String stringNumber = scanner.nextLine();
		
		scanner.close();
		
		int[] array = Arrays
				.stream(stringArray.split(","))
				.mapToInt(Integer::parseInt)
				.toArray();
		System.out.println("Found the number in array? " + search(Integer.parseInt(stringNumber), array));
	}
	
	private static boolean search(int number, int[] array) {
		for(int iterator = 0; iterator < (array.length-1); iterator++) {
			if(number == array[iterator]) {
				return true;
			}
		}
		return false;
	}

}
