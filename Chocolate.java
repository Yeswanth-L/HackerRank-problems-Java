package com.HackerRank;
/*Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.

Lily decides to share a contiguous segment of the bar selected such that:

The length of the segment matches Ron's birth month, and,
The sum of the integers on the squares is equal to his birth day.
Determine how many ways she can divide the chocolate.
Sample ip1:
5
1 2 1 3 4
3 2
Sample op:
2
Sample ip2:
1
4
4 1
sample op:
1
 */


import java.util.Scanner;
public class Chocolate {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int d=sc.nextInt();
            int m=sc.nextInt();
            int count=0;
            for(int i=0;i<=n-m;i++){ //5-2=3 in that we have to run the program upto 3rd index
                int sum=0;
                for(int j=i;j<i+m;j++){ //i+m(0+2=2) 0<2 in that the program run and add upto 2 times only
                    sum=sum+a[j];
                }
                if(sum==d){
                    count++;}
            }System.out.println(count);
        }
    }


