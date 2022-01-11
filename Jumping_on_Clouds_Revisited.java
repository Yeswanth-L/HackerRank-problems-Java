package com.HackerRank;
/*
8 2
0 0 1 0 0 1 1 0
op : 92
 */
import java.util.Scanner;

public class Jumping_on_Clouds_Revisited {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] c=new int[n];
        for(int i=0;i<n;i++){
            c[i]=sc.nextInt();
        }
        int e=100,i=0;
        do{
            int d=(i+k)%n;
            if(c[d]==1){
                e-=2; }
            e--;
            i=(i+k)%n;
        }while(i!=0);
        System.out.println(e);
    }
}
