package com.company.Arrays_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class prime_n_to_r {
    public static boolean isprime(int n){
        if(n == 1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static int[] primee(int a, int b){
        int k=0;
        for(int i=a;i<=b;i++){
            if (isprime(i)) {
                k=k+1;
            }
        }
        int c=0;
        int[] arr= new int[k];
        for(int i=a;i<=b;i++){
            if (isprime(i)) {
                arr[c++]= i;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
     int[] ans=primee(100,200);
        System.out.println(Arrays.toString(ans));
    }
}
