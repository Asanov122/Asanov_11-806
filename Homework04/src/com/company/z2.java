package com.company;

import java.util.Scanner;


public class z2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] a = str.toCharArray();
        char[] b = str.toCharArray();
        int n = sc.nextInt();
        for (int i = 0; i < str.length(); i++) {
            if (i+n>=str.length()) {
                a[i] = b[str.length() - i+ n];
            } else {
                a[i] = b[n-i];
            }
        }
        for (int i = str.length()-1; i >= 0; i--) {


            System.out.print(a[i]);
        }
    }
}
