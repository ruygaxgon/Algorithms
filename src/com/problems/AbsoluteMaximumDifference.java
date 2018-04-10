package com.problems;

import java.util.Arrays;

public class AbsoluteMaximumDifference {
	public static void main(String args[]) {
		int[] array = {1,2,3,4,5};
		computeDifference(array);
	}
	
	private static void computeDifference(int[] array) {
		Arrays.sort(array);
		int max = Math.abs(array[0] - array[array.length-1]);
		
		System.out.println(max);
	}
}
