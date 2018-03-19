package com.problems;

import java.util.Arrays;

public class LeftShiftArray {

	public static void main(String[] args) {
        int length = 5;
        int shifts = 4;
        int array[] = {1,2,3,4,5};
        int[] shift = Arrays.copyOfRange(array,shifts,length);
        int[] shift2 = Arrays.copyOfRange(array,0,shifts);
        for(int i : shift) {
        	System.out.print(i+" ");
        }
        for(int i : shift2) {
        	System.out.print(i+" ");
        }
    }
	
}
