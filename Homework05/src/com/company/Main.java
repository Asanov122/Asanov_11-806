package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n1, n2, c = 0, i = 0;
        String n = "y";
        while (i == 0) {
            if (n.equals("y")) {
                System.out.println("Введите 1ое число");
                n1 = sc.nextDouble();

            } else {
                n1 = c;
            }
            System.out.println("Введите опратор");
            String op = sc.next();
            System.out.println("Введите 2ое число");
            n2 = sc.nextDouble();
            if (op.equals("+")) {
                c = n1 + n2;
                System.out.println("Ответ:" + c);
            }
            if (op.equals("-")) {
                c = n1 - n2;
                System.out.println("Ответ:" + c);
            }
            if (op.equals("*")) {
                c = n1 * n2;
                System.out.println("Ответ:" + c);
            }
            if (op.equals("/")) {
                c = n1 / n2;
                System.out.println("Ответ:" + c);
            }
            System.out.println("Сбросить результат?y/n");
            n = sc.next();
        }
    }
}

