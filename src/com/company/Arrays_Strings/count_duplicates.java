// no.of times duplicates are repeating
package com.company.Arrays_Strings;

import java.util.Scanner;

public class count_duplicates {
    public static void main(String[] args) {
        int count =1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=(i-1);j>=0;j--){
                if(arr[i] == arr[j]){
                    count++;
                    System.out.println(arr[i]+ " - "+count+" times");
                }
            }
            count =1;
        }
    }
}
