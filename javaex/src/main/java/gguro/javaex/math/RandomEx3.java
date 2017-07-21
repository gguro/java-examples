package gguro.javaex.math;

import java.util.Random;

import gguro.common.SLog;

public class RandomEx3 {
	public void test() {
		
		// generate random number in (100 +/- 5.0)  
		
		double MEAN = 100.0f;
		double VARIANCE = 5.0f;

		Random fRandom = new Random();

		for (int idx = 1; idx <= 10; ++idx) {
			SLog.log("Generated : " + getGaussian(MEAN, VARIANCE, fRandom));
		}
	}
	
	private double getGaussian(double aMean, double aVariance, Random fRandom) {
		return aMean + fRandom.nextGaussian() * aVariance;
	}
}
