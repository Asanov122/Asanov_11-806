package com.company;
import java.util.Scanner;
public class f {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(rec(n));


}
    static int rec(int n){
        if(n<10){
            return n;
        }else {
            System.out.print(n%10+" ");
            return rec(n/10);
        }
    }}