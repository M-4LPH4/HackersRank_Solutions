package com.hackersrank.algorithm;

import java.util.Scanner;

public class CountingValleys {

	static int countingValleys(int n, String s) {
		int count = 0;
		int level = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'U')
				level++;
			if (s.charAt(i) == 'D')
				level--;
			if (level == 0 && s.charAt(i) == 'U') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		in.close();
		int result = countingValleys(n, s);
		System.out.println(result);
		in.close();
	}
}
