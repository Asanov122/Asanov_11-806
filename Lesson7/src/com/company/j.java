package com.company;
import java.util.Scanner;
public class j {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        str=sc.nextLine();
        int i=str.length();
        int j=0;
        char[] line=str.toCharArray();
        System.out.println(rec(line,i,j));
    }
    static String rec(char[] line,int i,int j){
        if(j==i-j-1||1==(i-j-1)-j||1==j-(i-j-1)){
            return"Yes";
        }
        if(line[j]==line[i-j-1]){
            return rec(line,i,j+1);
        }else return "No";
    }
}
