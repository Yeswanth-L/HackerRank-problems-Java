package com.HackerRank;

import java.util.Scanner;

public class Find_Digits {
    static void result2(int n){
        int a=0,c=0;
        while(n>0){
            a=n%10;

            if(a!=0 && n%a==0)
                c++;

            n=n/10;
        }
        System.out.println(c);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            int n=sc.nextInt();
            result2(n);
        }

    }
}
