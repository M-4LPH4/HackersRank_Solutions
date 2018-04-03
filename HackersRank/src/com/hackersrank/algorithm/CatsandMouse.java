package com.hackersrank.algorithm;

import java.io.IOException;
import java.util.Scanner;

public class CatsandMouse {

	static String catAndMouse(int x, int y, int z) {
		if (Math.abs(z - x) == Math.abs(z - y)) {
			return "Mouse C";
		} else if (Math.abs(z - x) > Math.abs(z - y)) {
			return "Cat B";
		}
		return "Cat A";
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int q = Integer.parseInt(scan.nextLine().trim());

		for (int qItr = 0; qItr < q; qItr++) {
			String[] xyz = scan.nextLine().split(" ");

			int x = Integer.parseInt(xyz[0].trim());

			int y = Integer.parseInt(xyz[1].trim());

			int z = Integer.parseInt(xyz[2].trim());

			String result = catAndMouse(x, y, z);
			System.out.println(result);
		}
	}

}
