package com.company;
import java.util.Scanner;
public class z3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите количество эллементов");
        int count=sc.nextInt();
        int[] array=new int[count];
        for (int i = 0; i < count; i++) {
            array[i]=sc.nextInt();
        }
        int c=1;
        int j=1;
        for (int i = 0; i < count-1; i++) {
            if(array[i]==array[i+1]){
                c++;
            }
            else{
                c=0;
            }
            if(c>j){
                j=c;
            }
        }
        System.out.println(j);
    }
}
