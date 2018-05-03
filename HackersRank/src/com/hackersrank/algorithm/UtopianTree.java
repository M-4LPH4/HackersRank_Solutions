package com.hackersrank.algorithm;

import java.util.Scanner;

public class UtopianTree {

	static int utopianTree(int n) {
		int treeHeight = 1;
		if (n == 0) {
			return treeHeight;
		}
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				treeHeight += 1;
			} else {
				treeHeight *= 2;
			}
		}
		return treeHeight;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int result = utopianTree(n);
			System.out.println(result);
		}
		in.close();
	}
}
