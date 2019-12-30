package ch10.strategy.sample;

public class Hand {
    public static final int HANDVALUE_GUU = 0;  // ?¿½?¿½?¿½?¿½?¿½?¿½É½?¿½?¿½?¿½?¿½
    public static final int HANDVALUE_CHO = 1;  // ?¿½?¿½?¿½ç¥­?¿½?¿½É½?¿½?¿½?¿½?¿½
    public static final int HANDVALUE_PAA = 2;  // ?¿½Ñ¡?¿½?¿½?¿½É½?¿½?¿½?¿½?¿½
    public static final Hand[] hand = {         // ?¿½?¿½?¿½?¿½?¤±¤?¿½Î¼?¿½?¿½É½?¿½?¿½3?¿½Ä¤Î¥?¿½?¿½?¥¹¥?¿½?¿½?¿½
        new Hand(HANDVALUE_GUU),
        new Hand(HANDVALUE_CHO),
        new Hand(HANDVALUE_PAA),
    };
    private static final String[] name = {      // ?¿½?¿½?¿½?¿½?¤±¤?¿½Î¼?¿½?¿½Ê¸?¿½?¿½?¿½?¿½É½?¿½?¿½
        "?¿½?¿½?¿½?¿½", "?¿½?¿½?¿½ç¥­", "?¿½Ñ¡?¿½",
    };
    private int handvalue;                      // ?¿½?¿½?¿½?¿½?¤±¤?¿½Î¼?¿½?¿½?¿½?¿½
    private Hand(int handvalue) {
        this.handvalue = handvalue;
    }
    public static Hand getHand(int handvalue) { // ?¿½Í¤?¿½?¿½é¥¤?¿½?¥¹¥?¿½?¿½?¥¹¤?¿½?¿½?¿½?¿½?¿½
        return hand[handvalue];
    }
    public boolean isStrongerThan(Hand h) {     // this?¿½?¿½h?¿½?¿½?¶¯?¿½?¿½?¿½È¤?¿½true
        return fight(h) == 1;
    }
    public boolean isWeakerThan(Hand h) {       // this?¿½?¿½h?¿½?¿½?¿½å¤¤?¿½È¤?¿½true
        return fight(h) == -1;
    }
    private int fight(Hand h) {                 // ?¿½?¿½?¿½?¿½Ê¬?¿½?¿½?¿½?¿½0, this?¿½Î¾?¿½?¿½?¿½?¿½Ê¤?¿½1, h?¿½Î¾?¿½?¿½?¿½?¿½Ê¤?¿½-1
        if (this == h) {
            return 0;
        } else if ((this.handvalue + 1) % 3 == h.handvalue) {
            return 1;
        } else {
            return -1;
        }
    }
    public String toString() {                  // Ê¸?¿½?¿½?¿½?¿½É½?¿½?¿½?¿½?¿½?¿½Ñ´?¿½
        return name[handvalue];
    }
}
