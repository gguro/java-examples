package gguro.javaex.math;

import java.math.BigDecimal;
import java.math.BigInteger;

import gguro.common.Testable;

public class BigIntegerTest implements Testable{
	public void test() {
		
		System.out.println(">> BigInteger Test");
		
		BigInteger bi1=new BigInteger("20000000000000000000");
		BigInteger bi2=new BigInteger("10000000000000000000");
		
		System.out.println("bi1 = " + bi1);
		System.out.println("bi1 = " + bi2);
		
		System.out.println("bi1 + bi2 = " +  bi1.add(bi2));
		System.out.println("bi1 - bi2 = " +  bi1.subtract(bi2));
		System.out.println("bi1 * bi2 = " +  bi1.multiply(bi2));
		System.out.println("bi1 / bi2 = " +  bi1.divide(bi2));
		
		//double e1=1.6;
		//double e2=0.1;
		
		System.out.println(new BigDecimal("1.6").add(new BigDecimal("0.1")));
		
	}
}
