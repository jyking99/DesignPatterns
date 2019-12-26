package ch03.templateMethod;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');                  // 'H'����ä�CharDisplay�Υ��󥹥��󥹤�1�ĺ�롣
        AbstractDisplay d2 = new StringDisplay("Hello, world.");    // "Hello, world."����ä�StringDisplay�Υ��󥹥��󥹤�1�ĺ�롣
        AbstractDisplay d3 = new StringDisplay("����ˤ��ϡ�");     // "����ˤ��ϡ�"����ä�StringDisplay�Υ��󥹥��󥹤�1�ĺ�롣
        d1.display();                                               // d1,d2,d3�Ȥ⡢���٤�Ʊ��AbstractDisplay�Υ��֥��饹�Υ��󥹥��󥹤����顢
        d2.display();                                               // �Ѿ�����display�᥽�åɤ�ƤӽФ����Ȥ��Ǥ��롣
        d3.display();                                               // �ºݤ�ư��ϸġ��Υ��饹CharDisplay��StringDisplay����ޤ롣
    }
}
