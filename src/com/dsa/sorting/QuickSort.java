package com.dsa.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] array = {1,2,65,6,8,4,6,9,32};
		sort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}
	
	private static void sort(int[] array, int low, int high) {
		if(low < high) {
			int partition = doPartition(array, low, high);
			sort(array, low, partition-1);
			sort(array, partition+1, high);
		}
	}

	private static int doPartition(int[] array, int low, int high) {
		int pivot = array[high];
		
		int lowIndex = low - 1;
		
		for(int iterator = low; iterator < high; iterator++) {
			if(array[iterator] <= pivot) {
				lowIndex++;
				int temp = array[lowIndex];
				array[lowIndex] = array[iterator];
				array[iterator] = temp;
			}
		}

		int temp = array[lowIndex + 1];
		array[lowIndex + 1] = array[high];
		array[high] = temp;
		
		return lowIndex + 1;
	}
}
