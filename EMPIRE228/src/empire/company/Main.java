package empire.company;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Open file - 1  Create new file - 2  Editing file - 3");
        int x = sc.nextInt();

        System.out.println("File name");
        String name = sc.next();
        String separator = System.getProperty("file.separator");
        String FilePath = separator + "D:" + separator + "EMPIRE228" + separator + name + ".txt";

        if (x == 1) {
            OpenFile.Open(FilePath);
        }
        if(x==3){
            EditingFile.Editing(FilePath);
        }
        if(x==2) {
            CreateNewFile.Create(FilePath);
        }
    }
}
