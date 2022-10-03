package com.company.Arrays_Strings;

import java.util.Scanner;

public class count_Distinct {
    public static int countDigits(int n, int[] arr){
        int count = 0;
        boolean digit = true;
        for(int i=0;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[i] == arr[j]){
                    digit = false;
                    break;
                }
            }
            if(digit == true){
                count++;
            }
            digit = true;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = countDigits(n,arr);
        System.out.println(ans);
    }
}
