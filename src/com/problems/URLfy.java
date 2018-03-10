package com.problems;

/**
 * 
 * @author Ruy
 *
 * Write a method that replaces all spaces with %20, you are given the true length of the string as N
 */
public class URLfy {

	public static void main(String[] args) {
		String str = "Mr John Smith    ";
		int length = str.length();
		System.out.println("String: "+str);
		System.out.println("As url: "+urlfy(str, length));
		System.out.println("As url: "+urlfyUtility(str, length));
	}
	
	private static String urlfy(String str, int length) {		
		char[] urlArray = new char[length];
		char[] charArray = str.trim().toCharArray();
		
		int increase = 0;
		for(int i = 0; i < charArray.length; i++) {
			if(charArray[i] == ' ') {
				urlArray[increase] = '%';
				urlArray[increase+1] = '2';
				urlArray[increase+2] = '0';
				increase += 3;
			} else {
				urlArray[increase] = charArray[i];
				increase++;
			}
		}
		return String.copyValueOf(urlArray);
	}
	
	private static String urlfyUtility(String str, int length) {
		return str.trim().replaceAll(" ", "%20");
	}

}
