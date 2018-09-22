package com.company;
import java.util.Scanner;
public class z2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] a=str.toCharArray();
        for (int i = 0; i <str.length(); i++) {
            if(a[i]=='1' || a[i]=='2' || a[i]=='3'|| a[i]=='4'|| a[i]=='5'|| a[i]=='6'||a[i]=='7'|| a[i]=='8' ||a[i]=='9'|| a[i]=='0'){
                a[i]='*';
            }
        }
        String str1= new String(a);
        System.out.println(str1);
    }
}
