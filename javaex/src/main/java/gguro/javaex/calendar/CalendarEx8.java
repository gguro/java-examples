package gguro.javaex.calendar;

import java.text.DateFormatSymbols;
import java.util.Locale;

import gguro.common.Testable;

/**
 * Write a Java program to get localized day-in-week name.
 */

public class CalendarEx8 implements Testable {

	public void test() {
		// TODO Auto-generated method stub
		
		DateFormatSymbols symbols = new DateFormatSymbols(new Locale("ko"));
		//DateFormatSymbols symbols = new DateFormatSymbols(new Locale("de"));
		
		// for the current Locale :
		// DateFormatSymbols symbols = new DateFormatSymbols();
		String[] dayNames = symbols.getWeekdays();
		String[] monthNames = symbols.getMonths();
		
		System.out.println("==============");
		for (String s : dayNames) {
			System.out.println(s);
		}
		
		System.out.println("==============");
		
		for (String s : monthNames) {
			System.out.println(s);
		}
	}
}
