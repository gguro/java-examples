package gguro.javaex.calendar;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

import gguro.common.Testable;

/**
 * Write a Java program to add some hours to the current time. Write a Java
 * program to get a date after 2 weeks.
 */
public class CalendarEx11 implements Testable {

	public void test() {
		// TODO Auto-generated method stub
		LocalTime time = LocalTime.now();
		// adding four hours
		
		LocalTime newTime = time.plusHours(2);
		System.out.println();
		System.out.println("Time after 2 hours : " + newTime);
		System.out.println();
		
		//two weeks after
	     int noOfDays = 14; 
	     
	     Calendar cal = Calendar.getInstance();
	     
	     Date cdate = cal.getTime();
	     
	     cal.add(Calendar.DAY_OF_YEAR, noOfDays);
	     Date date = cal.getTime();
	     
	     System.out.println("\nCurrent Date: " + cdate+"\n");  
	     System.out.println("Day after two weeks: " + date +"\n");
		
	}
}