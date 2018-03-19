package com.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TriangleType {

	public static void main(String[] args) {
		String[] test = {
		"5",
		"49 49 49",
		"48 16 48",
		"48 99 48",
		"12 12 12",
		"41 41 15"};
		System.out.println(Arrays.toString(getType(test)));
	}

	static String[] getType(String[] abc) {
        ArrayList<String> result = new ArrayList<String>();
        for(String triangle : abc) {
            String[] sides = triangle.split(" ");
            if(sides.length == 3) {
            	HashMap<String, Integer> map = new HashMap<String, Integer>();
            	for(String side: sides) {
            		if(map.containsKey(side)) {
            			map.put(side, map.get(side)+1);
            		} else {
            			map.put(side, 1);
            		}
            	}
            	System.out.println("Map "+ map.toString());
            	for(String key : map.keySet()) {
            		if(map.get(key) == 2) {
            			System.out.println("Key "+ key + " isos");
            			result.add("Isosceles");
            			break;
            		} else if (map.get(key) == 3) {
            			System.out.println("Key "+ key + " equi");
            			result.add("Equilateral");
            			break;
            		} else {
            			System.out.println("Key "+ key + " none");
            			result.add("None of these");
            			break;
            		}
            	}
            }
        }
        
        return result.toArray(new String[result.size()]);
    }
}
