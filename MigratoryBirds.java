package com.HackerRank;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class MigratoryBirds {
            public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int count=0;
            ArrayList al=new ArrayList();
            for(int i=0;i<n-1;i++){
                if(a[i]==a[i+1]){
                    count++;
                    al.add(a[i]);}
            }
            Collections.sort(al);
            System.out.println(al.get(0));
        }
    }
