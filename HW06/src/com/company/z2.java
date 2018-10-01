package com.company;
import java.util.Scanner;
public class z2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            String line=new String();
            line=sc.nextLine();
        System.out.println(rec(line));

    }
    static String rec(String line){
        int lenght=line.length();
        char[] lines=line.toCharArray();
        int i=0;
        while(lines[i]==' '){
            i++;
        }
        String str=new String();
        for (int j = i; j < lenght; j++) {
        str+=lines[j];
        }
        return str;
    }
}
