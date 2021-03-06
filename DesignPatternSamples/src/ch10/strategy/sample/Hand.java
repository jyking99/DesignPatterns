package ch10.strategy.sample;

public class Hand {
    public static final int HANDVALUE_GUU = 0;  // ?申?申?申?申?申?申表?申?申?申?申
    public static final int HANDVALUE_CHO = 1;  // ?申?申?申腑�?申?申表?申?申?申?申
    public static final int HANDVALUE_PAA = 2;  // ?申僉?申?申?申表?申?申?申?申
    public static final Hand[] hand = {         // ?申?申?申?申?け�?申亮?申?申表?申?申3?申弔離?申?申?ス�?申?申?申
        new Hand(HANDVALUE_GUU),
        new Hand(HANDVALUE_CHO),
        new Hand(HANDVALUE_PAA),
    };
    private static final String[] name = {      // ?申?申?申?申?け�?申亮?申?申文?申?申?申?申表?申?申
        "?申?申?申?申", "?申?申?申腑�", "?申僉?申",
    };
    private int handvalue;                      // ?申?申?申?申?け�?申亮?申?申?申?申
    private Hand(int handvalue) {
        this.handvalue = handvalue;
    }
    public static Hand getHand(int handvalue) { // ?申佑?申?申薀�?申?ス�?申?申?ス�?申?申?申?申?申
        return hand[handvalue];
    }
    public boolean isStrongerThan(Hand h) {     // this?申?申h?申?申?強?申?申?申箸?申true
        return fight(h) == 1;
    }
    public boolean isWeakerThan(Hand h) {       // this?申?申h?申?申?申紊�?申箸?申true
        return fight(h) == -1;
    }
    private int fight(Hand h) {                 // ?申?申?申?申分?申?申?申?申0, this?申両?申?申?申?申覆?申1, h?申両?申?申?申?申覆?申-1
        if (this == h) {
            return 0;
        } else if ((this.handvalue + 1) % 3 == h.handvalue) {
            return 1;
        } else {
            return -1;
        }
    }
    public String toString() {                  // 文?申?申?申?申表?申?申?申?申?申儡?申
        return name[handvalue];
    }
}
