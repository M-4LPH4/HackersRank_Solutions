package com.hackersrank.algorithm;

import java.io.IOException;
import java.util.Scanner;

public class SavethePrisoner {

	static int saveThePrisoner(int n, int m, int s) {
		return (m+s-2) % n + 1;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		for (int tItr = 0; tItr < t; tItr++) {
			String[] nms = scanner.nextLine().split(" ");

			int n = Integer.parseInt(nms[0]);

			int m = Integer.parseInt(nms[1]);

			int s = Integer.parseInt(nms[2]);

			int result = saveThePrisoner(n, m, s);
			System.out.println(result);
		}
		scanner.close();
	}
}
