package gguro.javaex.calendar;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import gguro.common.Testable;

/**
 * Write a Java program to get year and months between two dates.
 */

public class CalendarEx13 implements Testable {

	public void test() {
		// TODO Auto-generated method stub
		 LocalDate today = LocalDate.now();    
	     LocalDate userday = LocalDate.of(2015, Month.MAY, 15); 
	     
	     Period diff = Period.between(userday, today); 
	     
	     System.out.println("\nDifference between "+ userday +" and "+ today +": " 
	     + diff.getYears() +" Year(s) and "+ diff.getMonths() +" Month()s\n");
	}

}
