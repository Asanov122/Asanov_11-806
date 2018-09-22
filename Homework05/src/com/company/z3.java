package com.company;
import java.util.Scanner;
public class z3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=0;
        char[]a=str.toCharArray();
        for (int i = 0; i <str.length(); i++) {
            int b=str.length()-1-i;
            n=n+((a[i]-48)* ((int)Math.pow(10,(b))));
        }
        System.out.println(n);
    }
}
