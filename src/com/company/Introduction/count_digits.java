package com.company.Introduction;

import java.util.Scanner;

public class count_digits {
    public static void main(String[] args) {
        int count = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y =Math.abs(n);
        while(y != 0){
            y = y/10;
            count++;
        }
        System.out.println(count);
    }
}
