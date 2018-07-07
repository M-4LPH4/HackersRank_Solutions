package com.hackersrank.tutorials.cracking.the.coding.interview;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			String expression = scanner.nextLine();
			// checkBalancedBracket(expression);
			System.out.println(isBalanced(expression) ? "YES" : "NO");
		}
		scanner.close();
	}

	static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '{')
				stack.push('}');
			else if (s.charAt(i) == '[')
				stack.push(']');
			else if (s.charAt(i) == '(')
				stack.push(')');
			else {
				if (stack.isEmpty() || stack.peek() != s.charAt(i))
					return false;
				stack.pop();
			}
		}
		return stack.isEmpty();
	}

	private static void checkBalancedBracket(String expression) {
		Map<Character, Character> matchPair = new HashMap<>();
		matchPair.put('{', '}');
		matchPair.put('[', ']');
		matchPair.put('(', ')');
		matchPair.put('}', '{');
		matchPair.put(']', '[');
		matchPair.put(')', '(');
		List<Character> stack = new LinkedList<>();
		for (int i = 0; i < expression.length(); i++) {
			if (!stack.isEmpty() && stack.get(0) == matchPair.get(expression.charAt(i))) {
				stack.remove(0);
			} else {
				stack.add(0, expression.charAt(i));
			}
		}
		if (stack.isEmpty()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
