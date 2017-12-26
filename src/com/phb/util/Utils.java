package com.phb.util;

import java.util.Arrays;
import java.util.Random;

public class Utils {
	public static int[] randInt(int size, int min, int max) {
		Random r = new Random();
		int[] result = new int[size];
		for(int i = 0; i < size; i++) {
			result[i] = size + r.nextInt(max-size);
		}
		return result;		
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(randInt(10, 10, 20)));
	}
}
