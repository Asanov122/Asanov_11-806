package com.company;
import javax.sound.sampled.Line;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Введите количество строк");
        int LineCount=sc.nextInt();
        System.out.println("Введите строки");
        String[] lines=new String[LineCount];
        for (int i = 0; i < LineCount; i++) {
            lines[i]=sc.nextLine();
        }
        boolean check=true;
        for (int i = 0; i < LineCount && check==true; i++) {
            check=false;
            for (int j = 0; j < LineCount-1; j++) {
                if (lines[j].length()>lines[j+1].length()){
                    String minor=lines[j];
                    lines[j]=lines[j+1];
                    lines[j+1]=minor;
                    check=true;
                }
            }
        }
        for (int i = 0; i < LineCount; i++) {
            System.out.println(lines[i]+" ");
        }
    }
}
