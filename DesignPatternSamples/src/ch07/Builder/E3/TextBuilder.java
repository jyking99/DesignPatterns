package ch07.Builder.E3;

public class TextBuilder implements Builder {
    private StringBuffer buffer = new StringBuffer();           // ���̃t�B�[���h�ɕ������\�z���Ă���
    private boolean madeTitle = false;
    
    public void makeTitle(String title) {                       // �v���[���e�L�X�g�ł̃^�C�g��
        buffer.append("==============================\n");          // �����
        buffer.append("�w" + title + "�x\n");                       // �w�x���̃^�C�g��
        buffer.append("\n");                                        // ��s
        
        madeTitle = true;
    }
    public void makeString(String str) {                        // �v���[���e�L�X�g�ł̕�����
    	if (!madeTitle) {
    		throw new RuntimeException("makeTitle���Ă΂�Ă��܂���B");
    	}
    	
    	buffer.append('��' + str + "\n");                           // �����̕�����
        buffer.append("\n");                                        // ��s
    }
    public void makeItems(String[] items) {                     // �v���[���e�L�X�g�ł̉ӏ�����
    	if (!madeTitle) {
    		throw new RuntimeException("makeTitle���Ă΂�Ă��܂���B");
    	}
    	
        for (int i = 0; i < items.length; i++) {
            buffer.append("�@�E" + items[i] + "\n");                // �E���̍���
        }
        buffer.append("\n");                                        // ��s
    }
    public void close() {                                       // �����̊���
    	if (!madeTitle) {
    		throw new RuntimeException("makeTitle���Ă΂�Ă��܂���B");
    	}
    	
        buffer.append("==============================\n");          // �����
    }
    public String getResult() {                                 // ������������
        return buffer.toString();                                   // StringBuffer��String�ɕϊ�
    }
}
