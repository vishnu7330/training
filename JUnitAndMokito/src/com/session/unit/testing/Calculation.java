package com.session.unit.testing;

import java.util.StringTokenizer;

public class Calculation {

	//method to find max number in a given array
	public int findMax(int arr[]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}

	// method that returns cube of the given number
	public int cube(int n) throws InvalidDataException {
		if( n >= 0) {
			return n * n * n;
		} else {
			throw new InvalidDataException();
		}
	}

	// method that returns reverse words
	public String reverseWord(String str) {

		StringBuilder result = new StringBuilder();
		StringTokenizer tokenizer = new StringTokenizer(str, " ");

		while (tokenizer.hasMoreTokens()) {
			StringBuilder sb = new StringBuilder();
			sb.append(tokenizer.nextToken());
			sb.reverse();

			result.append(sb);
			result.append(" ");
		}
		return result.toString().trim();
	}
}