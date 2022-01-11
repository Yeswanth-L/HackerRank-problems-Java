package com.HackerRank;

import java.util.Scanner;
/*
2
3 9
100 1000
o/p:
2
22
 */
public class Sherlock_and_Squares {
    static void square(int a,int b){
        double c=Math.sqrt(a);
        double  d=Math.sqrt(b);
        int e=(int)c;
        int f=(int)d,count=0;
        for(int i=e+1;i<=f;i++){
            count++;
        }
        if(c%1==0.0)
            count++;
        System.out.println(count);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            square(a,b);
        }
    }
}
