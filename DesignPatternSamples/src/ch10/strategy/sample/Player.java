package ch10.strategy.sample;

public class Player {
    private String name;
    private Strategy strategy;
    private int wincount;
    private int losecount;
    private int gamecount;
    public Player(String name, Strategy strategy) {         // 名?申?申?申?申?申?申略?申?申?申?申?申?申?申?申?申
        this.name = name;
        this.strategy = strategy;
    }
    public Hand nextHand() {                                // ?申?申略?申砲?申?申?申?申?申?申?申?申?申?申?申立?申討?申
        return strategy.nextHand();
    }
    public void win() {                 // ?申?申?申辰?申
        strategy.study(true);
        wincount++;
        gamecount++;
    }
    public void lose() {                // ?申蕕�?申?申
        strategy.study(false);
        losecount++;
        gamecount++;
    }
    public void even() {                // ?申?申?申?申分?申?申
        gamecount++;
    }
    public String toString() {
        return "[" + name + ":" + gamecount + " games, " + wincount + " win, " + losecount + " lose" + "]";
    }
}
