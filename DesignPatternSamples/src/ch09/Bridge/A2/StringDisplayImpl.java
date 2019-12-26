package ch09.Bridge.A2;

public class StringDisplayImpl extends DisplayImpl {
    private String string;                              // ������������������
    private int width;                                  // ����������������������������������
    public StringDisplayImpl(String string) {           //������������������������������string����
        this.string = string;                               //��������������������������
        this.width = string.getBytes().length;              //��������������������������������������������������������������
    }
    public void rawOpen() {
        printLine();
    }
    public void rawPrint() {
        System.out.println("|" + string + "|");         // ������"|"������������
    }
    public void rawClose() {
        printLine();
    }
    private void printLine() {
        System.out.print("+");                          // ����������������"+"������������������
        for (int i = 0; i < width; i++) {               // width����"-"������������
            System.out.print("-");                      // ������������������
        }
        System.out.println("+");                        // ����������������"+"������������������
    }
}
