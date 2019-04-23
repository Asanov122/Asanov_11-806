package Task3;

import java.io.*;

public class TW extends Thread {
    private String line;
    public ThreadWriter(String line) {
        this.line = line;
    }
    public String getLine() {
        return line;
    }
    @Override
    public void r() {
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream(new
                    File("Files/out.txt"), true));
            pw.println(getLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


