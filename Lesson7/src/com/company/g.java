package com.company;
import java.util.Scanner;
public class g {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(rec(n));
    }
    static int rec(int n){
        int c=0;
        int i=0;
        if(n<10){
            c+=n%10*(Math.pow(10,i));
            return c;
        }else{
            c+=n%(10*Math.pow(10,i));
            i++;
            n=n/10;
        }
return c;

    }}

