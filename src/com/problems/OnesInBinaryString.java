package com.problems;

/**
 * 
 * @author Ruy
 *
 *	Find the longest consecutive chain of 1s in a binary number
 */
public class OnesInBinaryString {
	
	private static final String ZERO = "0";
	public static void main(String[] args) {
        int n = 20;
        String binary = Integer.toBinaryString(n);
        String[] oneArray = binary.split(ZERO);
        int count = 0;
        for(String str : oneArray) {
            if(str.length() > count) {
                count = str.length();
            }
        }
        System.out.println(count);
	}

}
