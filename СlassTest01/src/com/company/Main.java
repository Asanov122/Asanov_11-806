package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[n*n];
        for (int i = 0; i <n*n; i++) {
            arr[i]=sc.nextInt();
        }
        arr=sortArr(arr);
        //for (int i = 0; i < n * n; i++) {
        //    System.out.print(arr[i]+" ");
        //}
        int[][]matrix=new int[n][n];
         fillSpiral(matrix,arr);
    }
    static int[] sortArr(int[] arr){
        Arrays.sort(arr);
        return arr;

    }
    static void fillSpiral(int[][] matrix,int[]arr) {
        int n = matrix.length;
        int h = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                matrix[i][j] = arr[h];
                h++;
            }
            for (int j = i; j < n - i; j++) {
                matrix[i][j] = arr[h];
                h++;
            }
            for (int j = n - 2 - i; j >= i; j--) {
                matrix[i][j] = arr[h];
                h++;
            }
            for (int j = n - 2 - i; j >= i; j--) {
                matrix[i][j] = arr[h];
                h++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    }

