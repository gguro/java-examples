package gguro.javaex.math;

import java.util.Random;

import gguro.common.Testable;

public class RandomEx1 implements Testable {

	public void test() {
		System.out.println("Generating 10 random integers in range 0..99.");
	    
		// Random class to generate random integers between 0 and N.
	    Random randomGenerator = new Random();
	    
	    for (int idx = 1; idx <= 10; ++idx){
	      int randomInt = randomGenerator.nextInt(100);
	      System.out.println("Generated : " + randomInt);
	    }
	    
	    System.out.println("Done.");
	}
}
