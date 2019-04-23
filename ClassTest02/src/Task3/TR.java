package Task3;

import java.util.Scanner;

public class TR extends Thread{

    @Override
    public void r() {
        Scanner scanner = new Scanner("Files/text.txt");
        while(scanner.hasNextLine()){
            ThreadWriter tw = new ThreadWriter(scanner.nextLine());
            tw.start();
        }
    }
}

