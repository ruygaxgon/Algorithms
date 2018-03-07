package com.problems;

public class CoinChange {

	private final static int[] COINS = {1, 5, 10, 50, 100, 500};
	private final static int BASE_CASE = 1;
	
	public static void main(String[] args) {
		
		System.out.println(calculatePossibleWays(610));
	}
	
	private static long calculatePossibleWays(int change) {
		if(change <= BASE_CASE) {
			return change;
		}
		int[] combinations = new int[change + 1];
		combinations[0] = BASE_CASE;
		for(int coin = 0; coin < COINS.length; coin++ ) {
			for(int iterator = COINS[coin]; iterator <= change; iterator++) {
				combinations[iterator] += combinations[iterator - COINS[coin]]; 
			}
		}	
		return combinations[change];
	}
	
}
