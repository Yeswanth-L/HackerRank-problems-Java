package com.HackerRank;

import java.util.Arrays;
import java.util.Scanner;
/*
3 2 3
1 2 3
0
1
2
 */
public class Circular_Array_Rotation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int q=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       int b[]=new int[q];
        for(int i=0;i<q;i++){
            b[i]=sc.nextInt();
        }


       for(int i=0;i<k;i++) {
           int temp = a[a.length - 1];
           int j = a.length - 1;
           while (j > 0) {
               a[j] = a[j - 1];
               j--;
           }
           a[0] = temp;
       }
       for(int j=0;j<q;j++){
           int c=b[j];
           System.out.println(a[c]);
       }
       System.out.println(Arrays.toString(a));
    }
}
