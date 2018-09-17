package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1ое число");
        double n1 = sc.nextDouble();
        System.out.println("Введите опратор");
        String op = sc.next();
        System.out.println(" Введите 2ое число");
        double n2 = sc.nextDouble();

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
}
