package templateMethod;

public class StringDisplay extends AbstractDisplay {    // StringDisplay�⡢AbstractDisplay�Υ��֥��饹��
    private String string;                              // ɽ������٤�ʸ����
    private int width;                                  // �Х���ñ�̤Ƿ׻�����ʸ����Ρ����ס�
    public StringDisplay(String string) {               // ���󥹥ȥ饯�����Ϥ��줿ʸ����string��
        this.string = string;                           // �ե�����ɤ˵�����
        this.width = string.getBytes().length;          // ���줫��Х���ñ�̤�����ե�����ɤ˵������Ƥ����ơ���ǻȤ���
    }
    public void open() {                                // �����С��饤�ɤ����������open�᥽�åɡ�
        printLine();                                    // ���Υ��饹�Υ᥽�å�printLine����������Ƥ��롣
    }
    public void print() {                               // print�᥽�åɤϡ�
        System.out.println("|" + string + "|");         // �ե�����ɤ˵������Ƥ�����ʸ����������"|"��Ĥ���ɽ����
    }
    public void close() {                               // close�᥽�åɤϡ�
        printLine();                                    // open��Ʊ����printLine�᥽�åɤ���������Ƥ��롣
    }
    private void printLine() {                          // open��close����ƤФ��printLine�᥽�åɤ���private�ʤΤǡ����Υ��饹��������ǻȤ��롣
        System.out.print("+");                          // �ȤγѤ�ɽ������"+"�ޡ�����ɽ����
        for (int i = 0; i < width; i++) {               // width�Ĥ�"-"��ɽ�����ơ�
            System.out.print("-");                      // �����Ȥ����Ѥ��롣
        }
        System.out.println("+");                        // �ȤγѤ�ɽ������"+"�ޡ�����ɽ����
    }
}
