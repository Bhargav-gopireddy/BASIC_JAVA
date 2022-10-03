//NTH TERM OF AP SERIES

package com.company.Introduction;
import java.util.Scanner;
public class nth_term_ap {
    public static int nth_term(int a,int n,int d){
        int ans = a+(n-1)*d;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(nth_term(a,n,d));
    }
}
