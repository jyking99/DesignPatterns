package ch07.Builder;

import java.io.*;

public class HTMLBuilder extends Builder {
    private String filename;                                    // ��������ե�����̾
    private PrintWriter writer;                                 // �ե�����˽񤭹���PrintWriter
    public void makeTitle(String title) {                       // HTML�ե�����ǤΥ����ȥ�
        filename = title + ".html";                                 // �����ȥ�򸵤˥ե�����̾����
        try {
            writer = new PrintWriter(new FileWriter(filename));     // PrintWriter����
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");    // �����ȥ�����
        writer.println("<h1>" + title + "</h1>");
    }
    public void makeString(String str) {                        // HTML�ե�����Ǥ�ʸ����
        writer.println("<p>" + str + "</p>");                       // <p>�����ǽ���
    }
    public void makeItems(String[] items) {                     // HTML�ե�����Ǥβվ��
        writer.println("<ul>");                                     // <ul>��<li>�ǽ���
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }
    public void close() {                                       // ʸ��δ���
        writer.println("</body></html>");                           // �������Ĥ���
        writer.close();                                             // �ե�����򥯥���
    }
    public String getResult() {                                 // ��������ʸ��
        return filename;                                            // �ե�����̾���֤�
    }
}
