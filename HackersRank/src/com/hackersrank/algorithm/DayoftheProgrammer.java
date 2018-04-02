package com.hackersrank.algorithm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DayoftheProgrammer {

	static String solve(int year) {
		int tempDaysCount = 0;
		int currentMonth = 0;
		for (int i = 1; i < 13; i++) {
			tempDaysCount += getNumberofDaysinMonth(year, i);
			if (tempDaysCount >= 256) {
				currentMonth = i;
				break;
			}
		}
		int dayofMonth = Math.abs(tempDaysCount - getNumberofDaysinMonth(year, currentMonth) - 256);
		String resultDate = dayofMonth + "/" + currentMonth + "/" + year;
		SimpleDateFormat formatDate = new SimpleDateFormat("d/M/yyyy");
		Date formattedDate = null;
		try {
			formattedDate = formatDate.parse(resultDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		SimpleDateFormat formatDateResult = new SimpleDateFormat("dd.MM.yyyy");
		return formatDateResult.format(formattedDate);
	}

	static int getNumberofDaysinMonth(int year, int month) {
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		} else if (month == 2) {
			return isLeapYear(year) ? 29 : 28;
		}
		return 31;
	}

	private static boolean isLeapYear(int year) {
		// Java implementation of Leap Year
		return ((year & 3) == 0) && ((year % 100) != 0 || (year % 400) == 0);
		// return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		in.close();
		String result = solve(year);
		System.out.println(result);
	}
}
