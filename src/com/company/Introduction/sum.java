//SUM OF N NATURAL NUMBER BY NAVIES AND EFFICIENT SOLUTION

package com.company.Introduction;
import java.util.Scanner;
public class sum {
    public static int naives_solution(int n){
        int res=0;
        for(int i=1;i<=n;i++){
            res = res+i;
        }
        return res;
    }
    public static int eff_solution(int n){
        int res = n*(n+1)/2;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(naives_solution(n));
        System.out.println(eff_solution(n));
    }
}
