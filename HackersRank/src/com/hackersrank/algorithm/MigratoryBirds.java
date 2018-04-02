package com.hackersrank.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MigratoryBirds {

	static int migratoryBirds(int n, int[] ar) {
		int tempResult = ar[0];
		int birdTypeResult = 0;
		Map<Integer, Integer> birdsMap = new HashMap<>();
		for (int i = 0; i < ar.length; i++) {
			int key = ar[i];
			if (birdsMap.containsKey(key)) {
				birdsMap.put(key, birdsMap.get(key) + 1);
			} else {
				birdsMap.put(key, 1);
			}
		}
		for (Integer birdKey : birdsMap.keySet()) {
			if (birdsMap.get(birdKey) > tempResult) {
				tempResult = birdsMap.get(birdKey);
				birdTypeResult = birdKey;
			}
		}
		return birdTypeResult;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		in.close();
		int result = migratoryBirds(n, ar);
		System.out.println(result);
	}
}
