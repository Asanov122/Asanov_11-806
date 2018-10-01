package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fact(a));
    }

    static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        int f = n * fact(n - 1);
        return f;
    }
}
