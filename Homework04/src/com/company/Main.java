package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();

        }
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == b[j]) {
                if (j == m - 1) {
                    System.out.println(i - j);
                    break;
                }
                j++;
            }
        }
        if (j != m - 1) {
            System.out.println("Второй массив не содержится в первом");
        }


    }
}
