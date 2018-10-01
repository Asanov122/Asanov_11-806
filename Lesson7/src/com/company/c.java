package com.company;

import java.util.Scanner;

public class c {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(ddd(m, n));
    }

     static int ddd(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m>0 && n==0){
            return ddd(m-1,1);
        }else if(m>0 && n>0){
            return ddd(m-1,ddd(m,n-1));
        }

        return 0;
    }
}