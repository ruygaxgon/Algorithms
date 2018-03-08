package com.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Ruy
 *
 *	Check if a string is a permutation of another string
 */
public class CheckIfPermutation {

	public static void main(String[] args) {
		String str = "ruygaxiola";
		String permutation = "gaxiolaruy";
		System.out.println(checkPemutation(str, permutation));
		System.out.println(checkPermMaps(str, permutation));
	}
	
	private static boolean checkPemutation(String str, String permutation) {
		if(str.length() != permutation.length()) {
			return false;
		}
		
		char[] strArray = str.toCharArray();
		char[] permArray = permutation.toCharArray();
		
		Arrays.sort(strArray);
		Arrays.sort(permArray);
		
		return Arrays.equals(strArray, permArray);
	}
	
	private static boolean checkPermMaps(String str, String permutation) {
		if(str.length() != permutation.length()) {
			return false;
		}
		
		char[] strArray = str.toCharArray();
		char[] permArray = permutation.toCharArray();
		
		Map<Character, Integer> strMap = new HashMap<Character, Integer>();
		Map<Character, Integer> permMap = new HashMap<Character, Integer>();
		
		for(char c : strArray) {
			int count = 0;
			if(strMap.containsKey(c)) {
				count = strMap.get(c);
				count++;
			}
			strMap.put(c, count);
		}
		
		for(char c : permArray) {
			int count = 0;
			if(permMap.containsKey(c)) {
				count = permMap.get(c);
				count++;
			}
			permMap.put(c, count);
		}
		
		for(char c : strMap.keySet()) {
			return permMap.containsKey(c) || strMap.get(c) == permMap.get(c);
		}
		
		return false;
	}
	
	

}
