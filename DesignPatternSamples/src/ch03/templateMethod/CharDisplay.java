package ch03.templateMethod;

public class CharDisplay extends AbstractDisplay {  // CharDisplay�ϡ�AbstractDisplay�Υ��֥��饹��
    private char ch;                                // ɽ�����٤�ʸ����
    public CharDisplay(char ch) {                   // ���󥹥ȥ饯�����Ϥ��줿ʸ��ch��
        this.ch = ch;                               // �ե�����ɤ˵������Ƥ�����
    }
    public void open() {                            // �����ѡ����饹�Ǥ���ݥ᥽�åɤ��ä��������ǥ����С��饤�ɤ��Ƽ�����
        System.out.print("<<");                     // ����ʸ����Ȥ���"<<"��ɽ�����롣
    }
    public void print() {                           // print�᥽�åɤ⤳���Ǽ������롣���줬display���鷫���֤��ƸƤӽФ���롣
        System.out.print(ch);                       // �ե�����ɤ˵������Ƥ�����ʸ����1��ɽ�����롣
    }
    public void close() {                           // close�᥽�åɤ⤳���Ǽ�����
        System.out.println(">>");                   // ��λʸ����">>"��ɽ����
    }
}
