package com.problems;

import java.util.HashSet;
import java.util.Set;

public class CheckAllPermutations {
	private static Set<String> permutations = new HashSet<String>();

	public static void main(String args[]) {
		permutation("", "200");
		System.out.println(permutations.size());
	}

	private static void permutation(String prefix, String suffix) {
		if (suffix.isEmpty()) {
			permutations.add(prefix + suffix);
		} else if (prefix.equals("0") || prefix.startsWith("0")) {
			return;
		} else {
			for (int i = 0; i < suffix.length(); i++) {
				System.out.println("Perm - " + prefix + " Word - " + suffix);
				permutation(prefix + suffix.charAt(i),
						suffix.substring(0, i) + suffix.substring(i + 1, suffix.length()));
			}
		}

	}
}
