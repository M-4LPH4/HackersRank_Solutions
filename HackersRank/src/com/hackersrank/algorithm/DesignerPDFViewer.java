package com.hackersrank.algorithm;

import java.util.Scanner;

public class DesignerPDFViewer {

	static int designerPdfViewer(int[] h, String word) {
		int tallestLetterHeight = findTallestLetter(h, word);
		return tallestLetterHeight * word.length();
	}

	private static int findTallestLetter(int[] h, String word) {
		int height = 0;
		for (int i = 0; i < word.length(); i++) {
			int tempHeight = h[((int) word.charAt(i)) - 97];
			if (height < tempHeight) {
				height = tempHeight;
			}
		}
		return height;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] h = new int[26];
		for (int h_i = 0; h_i < 26; h_i++) {
			h[h_i] = in.nextInt();
		}
		String word = in.next();
		int result = designerPdfViewer(h, word);
		System.out.println(result);
		in.close();
	}
}
