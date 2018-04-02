package com.hackersrank.algorithm;

import java.util.Scanner;

public class BonAppetit {

	public static void main(String[] args) {
		int n = 0, alergicFood = 0, actualPrice = 0, brianChargedPrice;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		alergicFood = in.nextInt();
		int[] food = new int[n];
		for (int i = 0; i < n; i++) {
			food[i] = in.nextInt();
			if (i != alergicFood)
				actualPrice += food[i];
		}
		brianChargedPrice = in.nextInt();
		if ((actualPrice / 2) == brianChargedPrice) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(Math.abs(brianChargedPrice - (actualPrice / 2)));
		}
		in.close();

	}

}
