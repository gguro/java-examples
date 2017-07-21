package gguro.javaex.calendar;

import java.util.Calendar;

import gguro.common.Testable;

/**
 * Example : Write a Java program to get the last day of the current month
 * 
 */

public class CalendarEx5 implements Testable {

	public void test() {
		// TODO Auto-generated method stub
		// Gets a calendar using the default time zone and locale.
		Calendar calendar = Calendar.getInstance();
		
		System.out.println();
		System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println();
	}

}
