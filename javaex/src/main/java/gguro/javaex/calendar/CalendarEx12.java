package gguro.javaex.calendar;

import gguro.common.Testable;

/**
 * Write a Java program to check a year is a leap year or not.
 */
public class CalendarEx12 implements Testable {

	public void test() {
		// TODO Auto-generated method stub

		// year to leap year or not
		int year = 2016;
		System.out.println();
		
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			System.out.println("Year " + year + " is a leap year");
		else
			System.out.println("Year " + year + " is not a leap year");
		System.out.println();
	}

}
