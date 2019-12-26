package ch09.Bridge.E1;

import java.util.Random;

public class RandomDisplay extends CountDisplay {
	public RandomDisplay(DisplayImpl impl) {
		super(impl);
	}
	
	public void randomDisplay(int times) {
		Random rand = new Random();
		int actualTimes = rand.nextInt(times)+1;
		multiDisplay(actualTimes);
	}
	
}
