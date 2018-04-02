package com.hackersrank.algorithm;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SockMerchant {

	static int sockMerchant(int n, int[] ar) {
		int matchCount = 0;
		Set<Integer> sockOdd = new HashSet<>();
		for (int i = 0; i < n; i++) {
			if (sockOdd.contains(ar[i])) {
				matchCount++;
				sockOdd.remove(ar[i]);
			} else {
				sockOdd.add(ar[i]);
			}
		}
		return matchCount;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		in.close();
		int result = sockMerchant(n, ar);
		System.out.println(result);
	}
}
