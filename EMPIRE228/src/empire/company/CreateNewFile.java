
package empire.company;

        import java.io.*;
        import java.util.*;

public class CreateNewFile {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File file = new File("/D:/EMPIRE228/xxx.txt");
        FileWriter writer = new FileWriter(file);
        String line = new String();
        String end = new String();
        end = "yes";
        String end2 = new String();
        end2 = "yes";
        while (end.equals(end2)) {
            System.out.println("enter text -'*', enter action -'&', enter end -'/'");
            String symbol = new String();
            symbol = sc.nextLine();
            if (symbol.equals("*")) {
                System.out.println("enter text");
                line = sc.nextLine();
                writer.write("* " + line + System.getProperty("line.separator"));
                writer.flush();
            }
            if (symbol.equals("&")) {
                System.out.println("enter action");
                line = sc.nextLine();
                writer.write("& " + line + " " + System.getProperty("line.separator"));
                writer.flush();
            }
            if (symbol.equals("/")) {
                System.out.println("enter end");
                writer.write("/"+ System.getProperty("line.separator"));
                System.out.println("Continue?(Write yes or no) ");
                end2 = sc.nextLine();}

        }
        writer.close();
    }
}



