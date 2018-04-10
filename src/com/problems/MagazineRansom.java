package com.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Ruy
 *
 *	Check if words in a magazine can make a ransom note
 */
public class MagazineRansom {

	public static void main(String[] args) {
		String[] magazine = "two times three is not four".split(" ");
		String[] ransomNote = "two times two is four".split(" ");
		
		System.out.println(check(magazine, ransomNote));
	}
	
	private static String check(String[] magazine, String[] ransomNote) {
		Map<String, Integer> magazineMap = new HashMap<String, Integer>();
		for(String m : magazine) {
			if(magazineMap.containsKey(m)) {
				magazineMap.put(m, magazineMap.get(m) + 1);
			} else {
				magazineMap.put(m, 1);
			}
		}
		
		for(String r : ransomNote) {
			if(!magazineMap.containsKey(r) || magazineMap.get(r) <= 0) {
				return "No";
			}
			
			magazineMap.put(r, magazineMap.get(r) - 1);
		}
		return "Yes";
		
	}

}

