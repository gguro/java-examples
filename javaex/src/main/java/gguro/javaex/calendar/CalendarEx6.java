package gguro.javaex.calendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import gguro.common.Testable;

/*
 * Write a Java program to calculate the first and last day of each week.
 */

public class CalendarEx6 implements Testable {

	public void test() {
		// TODO Auto-generated method stub
		// Get calendar set to current date and time
		Calendar c = Calendar.getInstance();

		// Set the calendar to monday of the current week
		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		
		System.out.println();
		
		// Print dates of the current week starting on Monday
		DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
		
		System.out.println(df.format(c.getTime()));
		
		c.add(Calendar.DATE, 6);
		
//		for (int i = 0; i < 6; i++) {
//			c.add(Calendar.DATE, 1);
//		}
		
		System.out.println(df.format(c.getTime()));
		System.out.println();
	}
}
