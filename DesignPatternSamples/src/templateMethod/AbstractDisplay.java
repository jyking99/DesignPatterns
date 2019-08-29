package templateMethod;

public abstract class AbstractDisplay { // ��ݥ��饹AbstractDisplay
    public abstract void open();        // ���֥��饹�˼�����ޤ�������ݥ᥽�å�(1) open
    public abstract void print();       // ���֥��饹�˼�����ޤ�������ݥ᥽�å�(2) print
    public abstract void close();       // ���֥��饹�˼�����ޤ�������ݥ᥽�å�(3) close
    public final void display() {       // ������ݥ��饹�Ǽ������Ƥ���᥽�å�display
        open();                             // �ޤ�open���ơ�
        for (int i = 0; i < 5; i++) {       // 5��print�򷫤��֤��ơ�
            print();                    
        }
        close();                            // �ĺǸ��close���롣���줬display�᥽�åɤǼ�������Ƥ������ơ�
    }
}
