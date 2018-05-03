package com.test;

import java.util.Scanner;

public class WordWeight {

	private static final int _64 = 64;

	public static void main(String[] args) {
		System.out.println("Input: A word");
		Scanner sc= new Scanner(System.in);
		String wordWeight = sc.nextLine();
		sc.close();
		wordWeight = wordWeight.toUpperCase();
		Integer totalWeight = 0;
		for (char character : wordWeight.toCharArray()) {
			totalWeight += ((int)character -_64);
		}
		System.out.println("Weight of the input word: "+totalWeight);
	}

}
