package com.company;

import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(rec(n));
    }

    static String rec(int n) {
        if(n==2){
            return "Yes";
        }
        if (n % 2!=0 ) {
            return ("No");
        } else
            return rec(n/2);

    }
}
