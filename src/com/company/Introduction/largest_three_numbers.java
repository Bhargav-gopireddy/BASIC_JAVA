//GREATEST NUMBER

package com.company.Introduction;
import java.util.Scanner;

public class largest_three_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>=b && a>=c){
            System.out.println(a+ " is greatest number");
        }
        else if(b>=a && b>=c){
            System.out.println(b+ " is greatest number");
        }
        else{
            System.out.println(c+ " is greatest number");
        }
    }

}
