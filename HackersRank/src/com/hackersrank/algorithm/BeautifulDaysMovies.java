package com.hackersrank.algorithm;

import java.util.Scanner;

public class BeautifulDaysMovies {

	static int beautifulDays(int i, int j, int k) {
		int count = 0;
		for (int i1 = i; i1 <= j; i1++) {
			int revrseDay = Integer.valueOf(new StringBuilder().append(i1).reverse().toString());
			if ((Math.abs(i1 - revrseDay) % k) == 0) {
				count++;
			}
		}
		return count;
	}

	static public int getReverseInt(int value) {
		int resultNumber = 0;
		for (int i = value; i != 0; i /= 10) {
			resultNumber = resultNumber * 10 + i % 10;
		}
		return resultNumber;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		int j = in.nextInt();
		int k = in.nextInt();
		int result = beautifulDays(i, j, k);
		System.out.println(result);
		in.close();
	}
}
