package gguro.fileio2;

import java.util.Calendar;
import java.util.Date;
import java.util.logging.Formatter;

import gguro.common.Testable;

public class PrintWriterEx1 implements Testable {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.printf("%d", 10);
		System.out.printf("%x%n", 10);
		System.out.printf("%2.1f%n", 1.23);
		System.out.printf("%b%n", true);
		System.out.printf("%s", "ABC");
		Calendar now = Calendar.getInstance();
		System.out.printf("%1$tY %1$tm %1$te", now);
		
		
	}

}
