package com.company.Arrays_Strings;

import java.util.Scanner;
public class Average {
    public static double avg(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double average = (double)sum/arr.length;
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        double res = avg(arr);
        System.out.println(res);
    }
}
