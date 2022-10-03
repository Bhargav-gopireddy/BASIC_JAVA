package com.company.Introduction;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res=0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = Math.max(a,b);
        int y = a*b;
        for(int i=x;i<=y;i++){
            if(i%a == 0 && i%b ==0){
                res = i;
                break;
            }
        }
        System.out.println(res);
    }
}
