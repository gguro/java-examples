package gguro.javaex.calendar;

import java.time.Instant;

import gguro.common.Testable;

/**
 * Write a Java program to get current timestamp.
 */
public class CalendarEx14 implements Testable {

	public void test() {
		// TODO Auto-generated method stub
		Instant timestamp = Instant.now(); 
	    System.out.println("\nCurrent Timestamp: " + timestamp+"\n"); 
	}

}
