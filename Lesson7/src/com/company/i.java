package com.company;
import java.util.Scanner;
public class i {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=n;
        System.out.println(rec(n,i));
    }
    static int rec(int n,int i){
        if(i==1){
            return ' ';
        }
        if(n%i==0){
            System.out.println(i);
            return rec(n,i-1);
        }else return rec(n,i-1);
}

}
