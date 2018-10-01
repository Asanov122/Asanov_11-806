package com.company;

import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        a = a + rec(n);
        System.out.println(a);
    }

    static int rec(int n) {
        if (n > 9) {
            return n % 10 + rec(n / 10);
        } else return n;
    }


}
