package com.company.Arrays_Strings;

import java.util.Scanner;

public class sorted_check {
    public static boolean sort(int n, int[] arr){
        for(int i=1;i<n;i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean ans = sort(n,arr);
        if(ans == true){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is non-sorted");
        }
    }
}
