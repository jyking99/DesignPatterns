package ch10.strategy;

public class Hand {
    public static final int HANDVALUE_GUU = 0;  // ������ɽ����
    public static final int HANDVALUE_CHO = 1;  // ���祭��ɽ����
    public static final int HANDVALUE_PAA = 2;  // �ѡ���ɽ����
    public static final Hand[] hand = {         // ����󤱤�μ��ɽ��3�ĤΥ��󥹥���
        new Hand(HANDVALUE_GUU),
        new Hand(HANDVALUE_CHO),
        new Hand(HANDVALUE_PAA),
    };
    private static final String[] name = {      // ����󤱤�μ��ʸ����ɽ��
        "����", "���祭", "�ѡ�",
    };
    private int handvalue;                      // ����󤱤�μ����
    private Hand(int handvalue) {
        this.handvalue = handvalue;
    }
    public static Hand getHand(int handvalue) { // �ͤ��饤�󥹥��󥹤�����
        return hand[handvalue];
    }
    public boolean isStrongerThan(Hand h) {     // this��h��궯���Ȥ�true
        return fight(h) == 1;
    }
    public boolean isWeakerThan(Hand h) {       // this��h���夤�Ȥ�true
        return fight(h) == -1;
    }
    private int fight(Hand h) {                 // ����ʬ����0, this�ξ����ʤ�1, h�ξ����ʤ�-1
        if (this == h) {
            return 0;
        } else if ((this.handvalue + 1) % 3 == h.handvalue) {
            return 1;
        } else {
            return -1;
        }
    }
    public String toString() {                  // ʸ����ɽ�����Ѵ�
        return name[handvalue];
    }
}
