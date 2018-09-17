package com.company;
import java.util.Scanner;

public class z2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n1 ,n2;
        String op = new String();
        String n ="n";
        while(n.equals("n")){
            System.out.println("Введите 1ое число");
            n1=sc.nextDouble();
            System.out.println("Введите опратор");
            op=sc.next();
            System.out.println("Введите 2ое число");
            n2=sc.nextDouble();
        if (op.equals("+")) {
            n1 = n1 + n2;
            System.out.println("Ответ:" + n1);
        }
        if (op.equals("-")) {
            n1 = n1 - n2;
            System.out.println("Ответ:" + n1);
        }
        if (op.equals("*")) {
            n1 = n1 * n2;
            System.out.println("Ответ:" + n1);
        }
        if (op.equals("/")) {
            n1 = n1 / n2;
            System.out.println("Ответ:" + n1);
        }

    }
}}
