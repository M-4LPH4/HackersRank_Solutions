package com.hackersrank.algorithm;

import java.util.Scanner;

public class TheHurdleRace {

	static int hurdleRace(int k, int[] height) {
		int maxHeight = 0;
		for (int i = 0; i < height.length; i++) {
			maxHeight = Math.max(maxHeight, height[i]);
		}
		return maxHeight > k ? maxHeight - k : 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] height = new int[n];
		for (int height_i = 0; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
		}
		in.close();
		int result = hurdleRace(k, height);
		System.out.println(result);
		in.close();
	}
}
