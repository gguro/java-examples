package gguro.javaex.calendar;

import java.util.Calendar;

import gguro.common.Testable;

public class CalendarEx1 implements Testable {

	public void test() {
		// TODO Auto-generated method stub
		int year = 2017;
		int month = 0; // January
		int date = 1;

		Calendar cal = Calendar.getInstance();
		// Sets the given calendar field value and the time value
		// (millisecond offset from the Epoch) of this Calendar undefined.
		cal.clear();
		System.out.println();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DATE, date);

		System.out.println(cal.getTime());
		System.out.println();
	}
}
