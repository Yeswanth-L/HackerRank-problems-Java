package com.HackerRank;

import java.util.Scanner;

public class Jump_on_clouds {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        int count=0;
        for(int i=0;i<n;){
            if(i+2<n && a[i+2]==0){
                i+=2;
           }
            else
                i++;
           count++;
        }
        System.out.println(count-1);
    }
}
