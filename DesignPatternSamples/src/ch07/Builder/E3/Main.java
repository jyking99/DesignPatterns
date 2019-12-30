package ch07.Builder.E3;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("plain")) {
            TextBuilder textbuilder = new TextBuilder();
            Director director = new Director(textbuilder);
            director.construct();
            String result = textbuilder.getResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HTMLBuilder htmlbuilder = new HTMLBuilder();
            Director director = new Director(htmlbuilder);
            director.construct();
            String filename = htmlbuilder.getResult();
            System.out.println(filename + "���쐬����܂����B");
        } else if (args[0].equals("text")) {
        	FileBuilder filebuilder = new FileBuilder();
        	Director director = new Director(filebuilder);
        	director.construct();
            String filename = filebuilder.getResult();
            System.out.println(filename + "���쐬����܂����B");
        } else {
            usage();
            System.exit(0);
        }
    }
    public static void usage() {
        System.out.println("Usage: java Main plain      �v���[���e�L�X�g�ŕ����쐬");
        System.out.println("Usage: java Main html       HTML�t�@�C���ŕ����쐬");
    }
}