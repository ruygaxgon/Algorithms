package com.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
    	int[] array = {3,2,1};
    	sort(array.length, array);
    }
    
    private static void sort(int n, int[] array) {
    	int totalSwaps = 0;
    	for (int i = 0; i < n; i++) {
            int numberOfSwaps = 0;

            for (int j = 0; j < n - 1; j++) {
                if (array[j] > array[j + 1]) {
                	int temp = array[j];
                	array[j] = array[j + 1];
                	array[j + 1] = temp;
                    numberOfSwaps++;
                }
            }
            if (numberOfSwaps == 0) {
                break;
            }
            totalSwaps += numberOfSwaps;
        }
    	int firstElement = array[0];
    	int lastElement = array[array.length-1];
    	System.out.println("Array is sorted in "+totalSwaps+" swaps");
    	System.out.println("First Element: "+firstElement);
    	System.out.println("Last Element: "+lastElement);
    }

}
