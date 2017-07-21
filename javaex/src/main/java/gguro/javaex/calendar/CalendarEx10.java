package gguro.javaex.calendar;

import java.time.LocalTime;

import gguro.common.Testable;

/**
 * Write a Java program to get the current local time.
 */

public class CalendarEx10 implements Testable {

	public void test() {
		// TODO Auto-generated method stub
		
		LocalTime time = LocalTime.now();
		
        System.out.println();
        // in hour, minutes, seconds, nano seconds
        System.out.println("Local time now : " + time);
        System.out.println();
	}

}
