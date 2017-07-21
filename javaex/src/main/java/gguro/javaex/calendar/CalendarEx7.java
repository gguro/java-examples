package gguro.javaex.calendar;

import java.time.YearMonth;

import gguro.common.Testable;

/*
 * Write a Java program to get the name of the first and last day of a month.
 */

public class CalendarEx7 implements Testable {

	public void test() {
		// TODO Auto-generated method stub
		YearMonth ym = YearMonth.of(2016, 9);

		String firstDay = ym.atDay(1).getDayOfWeek().name();
		String lastDay = ym.atEndOfMonth().getDayOfWeek().name();
		System.out.println();
		System.out.println(firstDay);
		System.out.println(lastDay);
		System.out.println();
	}
}
