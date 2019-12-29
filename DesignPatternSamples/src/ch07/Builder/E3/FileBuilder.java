package ch07.Builder.E3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileBuilder implements Builder {
	private String filename;
	private PrintWriter writer;
	
	public void makeTitle(String title) {
		filename = title + ".txt";                                 // �^�C�g�������Ƀt�@�C��������
        try {
            writer = new PrintWriter(new FileWriter(filename));     // PrintWriter�����
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        writer.println(title);
	}

	public void makeString(String str) {
		writer.println(str);
	}

	public void makeItems(String[] items) {
		for (String s : items) {
			writer.println(s);
		}
	}

	public void close() {
		writer.close();
	}
	
	public String getResult() {                                 // ������������
        return filename;                                            // �t�@�C������Ԃ�
    }
	
}
