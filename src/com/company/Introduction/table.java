package com.company.Introduction;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=1;i<=m;i++){
            System.out.print(n*i + " ");
        }
    }
}
