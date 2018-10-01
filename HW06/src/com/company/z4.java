package com.company;
import java.util.Scanner;
public class z4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int[] array=new int[count];
        for (int i = 0; i < count; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println(rec(count, array));
    }
    static boolean rec(int count, int[]array){
        for (int i = 0; i < count-1; i++) {
            for (int j = i+1; j <count  ; j++) {
                if(array[i]==array[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
