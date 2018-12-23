package empire.company;

import java.io.*;
import java.util.*;

public class EditingFile {
    public static void Editing(String FilePath) throws IOException {

        Scanner sc = new Scanner(System.in);
        File file = new File(FilePath);

        FileReader fr = new FileReader(file);

        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        List<String> list = new ArrayList<>();
        FileWriter writer = new FileWriter(file);
        while (line != null) {
            list.add(line);
            //System.out.println(line);

            line = reader.readLine();
        }
        String end = "yes";
        while (end.equals("yes")) {

            int n = 1;
            for (int i = 0; i < list.size(); i++) {

                System.out.println(n + ")" + list.get(i));
                n++;
            }
            System.out.println("Select the line you want to change");
            n = Integer.parseInt(sc.nextLine());
            System.out.println(list.get(n - 1));
            System.out.println("enter changes");
            String change = sc.nextLine();
            list.set(n - 1, change);
            System.out.println("Continue?");
            end = sc.next();
            sc.close();
        }
        for (int i = 0; i < list.size(); i++) {
            writer.write(list.get(i) + System.getProperty("line.separator"));
            writer.flush();
        }
        writer.close();
        System.out.println("Changes saved");

    }

}