package ch10.strategy.sample;

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
