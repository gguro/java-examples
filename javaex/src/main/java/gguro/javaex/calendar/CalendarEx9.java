package gguro.javaex.calendar;

import java.util.Calendar;

import gguro.common.Testable;

/**
 * Write a Java program to get a day of the week of a specific date.
 */

public class CalendarEx9 implements Testable {

	public void test() {
		// TODO Auto-generated method stub
		// Create a default calendar
		Calendar cal = Calendar.getInstance();
		
		// Set your date: cal.setTime(yourDate);
		System.out.println();
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("Day of the week : " + dayOfWeek);
		System.out.println();
	}

}
