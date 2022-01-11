package com.HackerRank;
import java.util.Scanner;
public class Counting_Valleys {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a=sc.next();
        //System.out.println(a[2]);
        int sum=0,v=0;
        for(int i=0;i<n;i++){
            char c=a.charAt(i);
            if(c=='U'){
                sum=sum+1;
            }
            else if(c=='D'){
                sum=sum-1;
            }
            else{}
            if(sum==0 && c=='U')
                v++;
        }

        System.out.println(v);
    }
}

