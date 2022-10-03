//FINDING EVEN OR ODD

package com.company.Introduction;
import java.util.Scanner;
public class even_odd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if(a%2 == 0){
            System.out.printf("%d is a Even number",a);
        }
        else{
            System.out.printf("%d is a odd number",a);
        }
    }
}
