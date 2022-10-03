package com.company.Introduction;
import java.util.Scanner;
public class Prime_Factorization {
    public static boolean prime(int n){
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
    public static void pf(int n){
        for(int i=2;i<n;i++){
            if(prime(i)){
                int x=i;
                while(n%x == 0){
                    System.out.print(i+ " ");
                    x = x*i;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pf(n);
    }
}
