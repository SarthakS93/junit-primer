package com.sarthaks93.practice.junit_primer.example;

public class Calculate {
	
	private int[] a = {1, 2, 3};
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public int findMax() {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

}
