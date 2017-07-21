package gguro.javaex.calendar;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

import gguro.common.Testable;

/**
 * Write a Java program to get the months remaining in the year.
 */

public class CalendarEx15 implements Testable {

	public void test() {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
		
		Period period = today.until(lastDayOfYear);
		System.out.println();
		System.out.println("Months remaining in the year: " + period.getMonths());
		System.out.println();
	}

}
