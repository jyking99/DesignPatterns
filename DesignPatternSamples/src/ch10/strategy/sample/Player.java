package ch10.strategy.sample;

public class Player {
    private String name;
    private Strategy strategy;
    private int wincount;
    private int losecount;
    private int gamecount;
    public Player(String name, Strategy strategy) {         // Ì¾?¿½?¿½?¿½?¿½?¿½?¿½Î¬?¿½?¿½?¿½?¿½?¿½?¿½?¿½?¿½?¿½
        this.name = name;
        this.strategy = strategy;
    }
    public Hand nextHand() {                                // ?¿½?¿½Î¬?¿½Ë¤?¿½?¿½?¿½?¿½?¿½?¿½?¿½?¿½?¿½?¿½?¿½Î©?¿½Æ¤?¿½
        return strategy.nextHand();
    }
    public void win() {                 // ?¿½?¿½?¿½Ã¤?¿½
        strategy.study(true);
        wincount++;
        gamecount++;
    }
    public void lose() {                // ?¿½é¤±?¿½?¿½
        strategy.study(false);
        losecount++;
        gamecount++;
    }
    public void even() {                // ?¿½?¿½?¿½?¿½Ê¬?¿½?¿½
        gamecount++;
    }
    public String toString() {
        return "[" + name + ":" + gamecount + " games, " + wincount + " win, " + losecount + " lose" + "]";
    }
}
