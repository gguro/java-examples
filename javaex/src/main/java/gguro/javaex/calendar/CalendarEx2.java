package gguro.javaex.calendar;

import java.util.Calendar;

import gguro.common.Testable;

public class CalendarEx2 implements Testable {

	public void test() {
		// TODO Auto-generated method stub
		
		// Create a default calendar
        Calendar cal = Calendar.getInstance();
       // Get and display information of current date from the calendar:
	    System.out.println();
        System.out.println("Year: " + cal.get(Calendar.YEAR));
        System.out.println("Month: " + cal.get(Calendar.MONTH));
        System.out.println("Day: " + cal.get(Calendar.DATE));
        System.out.println("Hour: " + cal.get(Calendar.HOUR));
        System.out.println("Minute: " + cal.get(Calendar.MINUTE));
	    System.out.println();
	}

}
