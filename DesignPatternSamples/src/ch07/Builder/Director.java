package ch07.Builder;

public class Director {
    private Builder builder;
    public Director(Builder builder) {      // Builder�Υ��֥��饹�Υ��󥹥��󥹤�Ϳ������Τǡ�
        this.builder = builder;             // builder�ե�����ɤ��ݻ����Ƥ�����
    }
    public void construct() {             // ʸ����
        builder.makeTitle("Greeting");              // �����ȥ�
        builder.makeString("ī������ˤ�����");     // ʸ����
        builder.makeItems(new String[]{             // �վ��
            "���Ϥ褦�������ޤ���",
            "����ˤ��ϡ�",
        });
        builder.makeString("���");                 // �̤�ʸ����
        builder.makeItems(new String[]{             // �̤βվ��
            "����Ф�ϡ�",
            "���䤹�ߤʤ�����",
            "���褦�ʤ顣",
        });
        builder.close();                 // ʸ�����������
    }
}
