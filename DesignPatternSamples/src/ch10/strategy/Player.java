package ch10.strategy;

public class Player {
    private String name;
    private Strategy strategy;
    private int wincount;
    private int losecount;
    private int gamecount;
    public Player(String name, Strategy strategy) {         // ̾������ά���������
        this.name = name;
        this.strategy = strategy;
    }
    public Hand nextHand() {                                // ��ά�ˤ�����������Ω�Ƥ�
        return strategy.nextHand();
    }
    public void win() {                 // ���ä�
        strategy.study(true);
        wincount++;
        gamecount++;
    }
    public void lose() {                // �餱��
        strategy.study(false);
        losecount++;
        gamecount++;
    }
    public void even() {                // ����ʬ��
        gamecount++;
    }
    public String toString() {
        return "[" + name + ":" + gamecount + " games, " + wincount + " win, " + losecount + " lose" + "]";
    }
}
