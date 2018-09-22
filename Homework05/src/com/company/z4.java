package com.company;

import java.util.Scanner;

public class z4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = sc.nextLine();
        boolean su=false;
        while (su == false) {
            System.out.println("Введите ключ-символ");
            String r = sc.next();

            if (r.equals("u")) {
                System.out.println(str.toUpperCase());
                su=true;
            }
            if (r.equals("l")){
                System.out.println(str.toLowerCase());
            su=true;}

        }
    }
}
