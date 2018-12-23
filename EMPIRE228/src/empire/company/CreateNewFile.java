
package empire.company;

import java.io.*;
import java.util.*;

public class CreateNewFile {

    public static void Create(String FilePath) throws IOException {
        Scanner sc = new Scanner(System.in);
        File file = new File(FilePath);
        if (file.createNewFile()) {
            System.out.println(FilePath + " Файл создан");


        FileWriter writer = new FileWriter(file);
        String end ="yes";
        while (end.equals("yes")) {

            System.out.println("enter text -'*', enter action -'&', enter end -'/'");
            String symbol = sc.nextLine();

            if (symbol.equals("*")) {
                System.out.println("enter text");
                String line = sc.nextLine();
                writer.write("* " + line + System.getProperty("line.separator"));
                writer.flush();
            }
            if (symbol.equals("&")) {
                System.out.println("enter action(Format- '1. 3 2. 5(space)'  ");
                String line = sc.nextLine();
                writer.write("& " + line + " " + System.getProperty("line.separator"));
                writer.flush();
            }
            if (symbol.equals("/")) {
                System.out.println("enter end");
                writer.write("/" + System.getProperty("line.separator"));
                System.out.println("Continue?(Write yes or no) ");
                end = sc.nextLine();
            }

        }
        writer.close();
    }
     else {
        System.out.println("Файл " + FilePath + " уже существует");
    }
}}




