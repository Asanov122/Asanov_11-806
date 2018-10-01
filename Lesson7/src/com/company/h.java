package com.company;
import java.util.Scanner;
public class h {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        System.out.println(rec(n,i));
    }
    static String rec(int n,int i){
        if(i==n){
            return "Yes";
        }
        if(n%i!=0){
            return rec(n,i+1);
        }else{
            return "No";
        }
    }
}
