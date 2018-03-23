package com.hackersrank.algorithm;

import java.util.Scanner;

public class SeparatetheNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			String s = in.next();
			boolean valid = false;
			long firstx = -1;
			// Try each possible starting number
			for (int j = 1; j <= s.length() / 2; ++j) {
				long x = Long.parseLong(s.substring(0, j));
				firstx = x;
				// Build up sequence starting with this number
				String test = Long.toString(x);
				while (test.length() < s.length()) {
					test += Long.toString(++x);
				}
				// Compare to original
				if (test.equals(s)) {
					valid = true;
					break;
				}
			}
			System.out.println(valid ? "YES " + firstx : "NO");
		}
		in.close();
	}
}
