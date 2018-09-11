package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b=0,j=0;
        int[] a;
        a = new int[10];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            b=b+a[i];
        }
        b=b/n+b%n;
        System.out.print(b+" ");
        for (int i = 0; i < n; i++) {
            if(b>a[i]){
                j++;
            }
        }
        System.out.println(j);

    }
}
