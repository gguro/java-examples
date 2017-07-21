package gguro.javaex.calendar;

import java.time.LocalDate;
import java.time.Period;

import gguro.common.Testable;

/**
 * Write a Java program to calculate your age.
 */

/**
 * Expected results -------------------- I am 28 years, 2 months and 10 days
 * old. --------------------
 */

public class CalendarEx18 implements Testable {

	public void test() {
		// TODO Auto-generated method stub

		// date of birth
		LocalDate pdate = LocalDate.of(1989, 04, 11);
		// current date
		LocalDate now = LocalDate.now();
		// difference between current date and date of birth
		Period diff = Period.between(pdate, now);

		System.out.printf("\nI am  %d years, %d months and %d days old.\n\n", 
				diff.getYears(), diff.getMonths(), diff.getDays());
	}

}
