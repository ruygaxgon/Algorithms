package com.problems;

public class JewelsAndStones {

	public static void main(String[] args) {
		String jewels = "aA";
		String stones = "aAAbbbb";
		findJewels(jewels, stones);
	}
	
	private static void findJewels(String jewels, String stones) {
		char[] jewelArray = jewels.toCharArray();
		char[] stoneArray = stones.toCharArray();
		
		int jewelCount = 0;
		for(int j = 0; j < jewelArray.length; j++) {
			for(int s = 0; s < stoneArray.length; s++) {
				if(stoneArray[s] == jewelArray[j]) {
					jewelCount++;
				}
			}
		}
		System.out.println("Found "+ jewelCount +" jewels");
	}

}
