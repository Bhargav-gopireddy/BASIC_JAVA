package com.company.Arrays_Strings;

import java.util.Scanner;
public class Max_element {
    public static int largest(int []arr){
        int max = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int res = largest(arr);
        System.out.println(res);
    }
}
