package com.hackersrank.algorithm;

import java.util.Scanner;

public class PickingNumbers {

	static int pickingNumbers(int[] a) {
		int[] frequency = new int[100];
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			frequency[a[i]]++;
		}
		for (int i = 2; i < frequency.length; i++) {
			result = Math.max(result, frequency[i] + frequency[i - 1]);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		in.close();
		int result = pickingNumbers(a);
		System.out.println(result);
		in.close();
	}
}
