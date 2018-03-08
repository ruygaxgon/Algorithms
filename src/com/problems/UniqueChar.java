package com.problems;

/**
 * 
 * @author Ruy
 *
 *	Check if characters are unique in string
 */
public class UniqueChar {

	public static void main(String[] args) {
		String str = "abcdeefg";
		System.out.println(checkUnique(str));
	}
	
	private static boolean checkUnique(String str) {
		char[] strArray = str.toCharArray();
		
		for(int i = 0; i < strArray.length; i++) {
			for(int j = i+1; j < strArray.length; j++) {
				System.out.println("Char: "+strArray[i]+" - "+strArray[j]);
				if(strArray[i] == strArray[j]) {
					return false;
				}
			}	
		}
		
		return true;
	}

}
