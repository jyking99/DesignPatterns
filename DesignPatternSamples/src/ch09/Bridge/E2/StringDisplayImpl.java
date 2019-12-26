package ch09.Bridge.E2;
public class StringDisplayImpl extends DisplayImpl {
    private String string;                              // ɽ������٤�ʸ����
    private int width;                                  // �Х���ñ�̤Ƿ׻�����ʸ����Ρ�����
    public StringDisplayImpl(String string) {           //���󥹥ȥ饯�����Ϥ��줿ʸ����string��
        this.string = string;                               //�ե�����ɤ˵������Ƥ�����
        this.width = string.getBytes().length;              //���줫��Х���ñ�̤�����ե�����ɤ˵������Ƥ����ơ���ǻȤ���
    }
    public void rawOpen() {
        printLine();
    }
    public void rawPrint() {
        System.out.println("|" + string + "|");         // �����"|"��Ĥ���ɽ��
    }
    public void rawClose() {
        printLine();
    }
    private void printLine() {
        System.out.print("+");                          // �ȤγѤ�ɽ������"+"�ޡ�����ɽ�����롣
        for (int i = 0; i < width; i++) {               // width�Ĥ�"-"��ɽ�����ơ�
            System.out.print("-");                      // �����Ȥ����Ѥ��롣
        }
        System.out.println("+");                        // �ȤγѤ�ɽ������"+"�ޡ�����ɽ�����롣
    }
}
