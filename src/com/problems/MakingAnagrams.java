package com.problems;

import java.util.stream.IntStream;

public class MakingAnagrams {

	public static void main(String[] args) {
		String one = "abcdef";
		String two = "dbfirjglt";
		
		//Create array that will contain the number of times the letter appears
		int [] letters =  new int[26];
		// fill the array with the number of timer a letter appears
		one.chars().forEach( c -> { letters[c-'a']++; });
		// reduce the number of time the letter appears
		two.chars().forEach( c -> { letters[c-'a']--; });
		
		System.out.println(IntStream
				.of(letters)
				//get difference in a positive integer
				.map( i -> Math.abs(i))
				.sum());
	}

}
