package com.company;
import java.util.Scanner;

public class z3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        char[] a= str.toCharArray();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        char[] strResult1 =new char[n2-n1+1];
        int j=0;
        for (int i = 0; i < str.length(); i++) {
            if(i<n1 || i>n2){
                strResult1[j]=a[i];
                j++;
            }
        }
        String strResult=new String(strResult1);
        System.out.println(strResult);
    }
}
