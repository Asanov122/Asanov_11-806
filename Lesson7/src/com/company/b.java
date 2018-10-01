package com.company;
import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(brr(a, c));

    }
    static String brr(int a,int c){
        if (a==c){
            return ""+a;
        }
        if (a>c){
            return a+ " "+brr(a-1,c);

        } else
            return a+" "+ brr(a+1,c);

    }
}
