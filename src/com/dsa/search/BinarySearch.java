package com.dsa.search;

public class BinarySearch {

	public static void main(String[] args) {
		doOrderedSearch(5, new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15});
	}
	
	public static int doOrderedSearch(int number, int[] array) {
		int low = 0;
		int high = array.length - 1;
		while(low <= high) {
			int mid = (high + low) / 2;
			System.out.println("Low "+low+" - High "+high+" - Mid "+mid+" - Value "+array[mid]);
			if(array[mid] == number) {
				return mid;
			} else if(array[mid] < number) {
				low = mid + 1;
			} else {
				high = mid - 1; 
			}
		
		}
		
		return -1;
	}

}
