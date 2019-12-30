package ch07.Builder.E2;

public class Director {
    private Builder builder;
    public Director(Builder builder) {      // Builder�̃T�u�N���X�̃C���X�^���X���^������̂ŁA
        this.builder = builder;             // builder�t�B�[���h�ɕێ����Ă����B
    }
    public void construct() {             // �����\�z
    	builder.makeString("�����璋�ɂ�����");     // ������
        builder.makeTitle("Greeting");              // �^�C�g��
        
        builder.makeItems(new String[]{             // �ӏ�����
            "���͂悤�������܂��B",
            "����ɂ��́B",
        });
        builder.makeString("���");                 // �ʂ̕�����
        builder.makeItems(new String[]{             // �ʂ̉ӏ�����
            "����΂�́B",
            "���₷�݂Ȃ����B",
            "���悤�Ȃ�B",
        });
        builder.close();                 // ����������������
    }
}