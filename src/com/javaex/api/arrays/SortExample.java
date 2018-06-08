package com.javaex.api.arrays;

import java.util.Arrays;

public class SortExample {
public static void main(String[] args) {
	int[] scores= {80,50,30,90,75,88,77};
	
	System.out.println(Arrays.toString(scores));
	Arrays.sort(scores);
	System.out.println(Arrays.toString(scores));
	
}
}
