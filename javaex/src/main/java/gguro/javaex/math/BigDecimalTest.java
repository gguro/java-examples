package gguro.javaex.math;

import java.math.BigDecimal;
import java.math.MathContext;

import gguro.common.Testable;

public class BigDecimalTest implements Testable{
	public void test() {
		
		System.out.println(">> BigDecimal Test");
		
		BigDecimal bd1 = new BigDecimal("1.0000001");
		BigDecimal bd2 = new BigDecimal("2.0000001");
		
		System.out.println("bd1 = " + bd1);
		System.out.println("bd2 = " + bd2);
		
		System.out.println("bd1 + bd2 = " +  bd1.add(bd2));
		System.out.println("bd1 - bd2 = " +  bd1.subtract(bd2));
		System.out.println("bd1 * bd2 = " +  bd1.multiply(bd2));
		//System.out.println("bd1 / bd2 = " +  bd1.divide(bd2));	// endless
		System.out.println("bd1 / bd2 = " +  bd1.divide(bd2, MathContext.DECIMAL32));
		System.out.println("bd1 / bd2 = " +  bd1.divide(bd2, MathContext.DECIMAL64));
		
	}

}
