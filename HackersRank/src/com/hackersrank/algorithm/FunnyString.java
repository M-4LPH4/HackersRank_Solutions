package com.hackersrank.algorithm;

import java.util.Scanner;

public class FunnyString {

	static String funnyString(String s) {
		String r = new StringBuilder(s).reverse().toString();
		int length = (int) Math.floor(s.length() / 2);
		for (int i = 0; i < length; i++) {
			if ((Math.abs(s.charAt(i + 1) - s.charAt(i))) != (Math.abs(r.charAt(i + 1) - r.charAt(i)))
					|| (length - i - 2 > -1) && (Math.abs(s.charAt(length - i - 1) - s.charAt(length - i - 2))) != (Math
							.abs(r.charAt(length - i - 1) - r.charAt(length - i - 2)))) {
				return "Not Funny";
			}
		}
		return "Funny";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			String s = in.next();
			String result = funnyString(s);
			System.out.println(result);
		}
		in.close();
	}

}
