package com.hackersrank.algorithm;

import java.util.Scanner;

public class ViralAdvertising {

	static int viralAdvertising(int n) {
		double recipients = 5;
		int cumulativeLikes = 0;
		double likes;
		for (int i = 1; i <= n; i++) {
			likes = Math.floor(recipients / 2);
			cumulativeLikes += likes;
			recipients = likes * 3;
		}
		return cumulativeLikes;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result = viralAdvertising(n);
		System.out.println(result);
		in.close();
	}

}
