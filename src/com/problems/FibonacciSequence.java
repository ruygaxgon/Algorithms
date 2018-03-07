package com.problems;

public class FibonacciSequence {
	public static void main(String[] args) {
		System.out.println(calculateF(8181));
	}
	
	private static long calculateF(long number) {
		if(number <= 1) {
			return number;
		}
		
		long firstValue = 0;
		long secondValue = 1;
		for(long iterator = 2; iterator <= number; iterator++) {
			long sumValues = firstValue + secondValue;
			firstValue = secondValue;
			secondValue = sumValues;
		}
		return secondValue;
	}
}
