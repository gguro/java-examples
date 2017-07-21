package gguro.javaex.calendar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import gguro.common.Testable;

/**
 * Write a Java program to convert a string to date.
 */

/**
 * Expected results
--------------------
2016-05-01
--------------------
 */


public class CalendarEx17 implements Testable {

	public void test() {
		// TODO Auto-generated method stub
		String string = "May 1, 2016";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate date = LocalDate.parse(string, formatter);
		System.out.println();
		System.out.println(date);
		System.out.println();
	}

}
