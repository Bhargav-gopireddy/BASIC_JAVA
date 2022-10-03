package com.company.Introduction;

import java.util.Scanner;

public class prime_number {
    public static boolean prime_naive(int n){
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
    public static boolean prime_eff(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(prime_naive(n));
        System.out.println(prime_eff(n));
    }
}
