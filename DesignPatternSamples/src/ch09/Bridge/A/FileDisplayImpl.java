package ch09.Bridge.A;

import java.io.*;

public class FileDisplayImpl extends DisplayImpl {
    private String filename;
    private BufferedReader reader;
    private final int MAX_READAHEAD_LIMIT = 4096;   // ?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申
    public FileDisplayImpl(String filename) {
        this.filename = filename;
    }
    public void rawOpen() {
        try {
            reader = new BufferedReader(new FileReader(filename));
            reader.mark(MAX_READAHEAD_LIMIT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("=-=-=-=-=-= " + filename + " =-=-=-=-=-="); // ?申?申?申?申?申?申
    }
    public void rawPrint() {
        try {
            String line;
            reader.reset(); // mark?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申
            while ((line = reader.readLine()) != null) {
                System.out.println("> " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void rawClose() {
        System.out.println("=-=-=-=-=-= "); // ?申?申?申?申?申?申
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
