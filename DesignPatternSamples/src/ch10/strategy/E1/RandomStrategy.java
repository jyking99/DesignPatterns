package ch10.strategy.E1;

import java.util.Random;

public class RandomStrategy implements Strategy {
	 private Random random;
	 private int nextHandSeed;
	 private Hand hand;
	 
	public RandomStrategy(int seed) {
		random = new Random(seed);
	}
	
	public Hand nextHand() {
		nextHandSeed = random.nextInt(3);
		hand = Hand.getHand(nextHandSeed);
		
		return hand;
	}

	@Override
	public void study(boolean win) {
		
	}

}
