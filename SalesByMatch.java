package com.HackerRank;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
import java.util.Collections;
public class SalesByMatch {
    public static void main(String args[]) {
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int a[]=new int[n];
                for(int i=0;i<n;i++){
                    a[i]=sc.nextInt();
                }
                LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
                for (int i = 0; i < a.length; i++){
                    set.add(a[i]);
                }
                System.out.println(set);
                System.out.println("Set size "+set.size());

                Integer arr[] = new Integer[set.size()];  //object to integer
                arr = set.toArray(arr);

                int sum=0;
                ArrayList al=new ArrayList();
                for(int i=0;i<arr.length;i++){
                    int count=0;
                    for(int j=0;j<n;j++){
                        if(arr[i]==a[j]){
                            count++;
                        }}
                    al.add(count);

                }
                System.out.println(al);
                for(int i=0;i<al.size();i++){
                    int c=(int)al.get(i);
                    if(c>=2){
                        c=c%2;
                        if(c!=0)
                            sum++;}
                }
                System.out.println(sum);
            }

        }
