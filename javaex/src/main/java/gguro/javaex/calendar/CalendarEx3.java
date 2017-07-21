package gguro.javaex.calendar;

import java.util.Calendar;
import java.util.TimeZone;

import gguro.common.Testable;

/**
 * 
 * >> Example
 * Write a Java program to get the current time in New York
 *
 */

public class CalendarEx3 implements Testable {

	public void test() {
		// TODO Auto-generated method stub
		Calendar calNewYork = Calendar.getInstance();
		
		calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		
		System.out.println();
		System.out.println("Time in New York: " 
				+ calNewYork.get(Calendar.HOUR_OF_DAY) + ":"
				+ calNewYork.get(Calendar.MINUTE) + ":" 
				+ calNewYork.get(Calendar.SECOND));
		System.out.println();
	}

}
