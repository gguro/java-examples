package gguro.javaex.math;

import java.util.Random;

import gguro.common.SLog;
import gguro.common.Testable;

public class RandomEx2 implements Testable {
	public void test() {
		SLog.log("Generating random integers in the range 1..10.");
	    
	    int START = 1;
	    int END = 10;
	    Random random = new Random();
	    
	    for (int idx = 1; idx <= 10; ++idx){
	      showRandomInteger(START, END, random);
	    }
	    
	    SLog.log("Done.");
	}
	
	private void showRandomInteger(int aStart, int aEnd, Random aRandom) {
		if (aStart > aEnd) {
			throw new IllegalArgumentException("Start cannot exceed End.");
		}
		
		// get the range, casting to long to avoid overflow problems
		long range = (long) aEnd - (long) aStart + 1;
		
		// compute a fraction of the range, 0 <= frac < range
		long fraction = (long) (range * aRandom.nextDouble());
		int randomNumber = (int) (fraction + aStart);
		SLog.log("Generated : " + randomNumber);
		
	}
	
	
}
