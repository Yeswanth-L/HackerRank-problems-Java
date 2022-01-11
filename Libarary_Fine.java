package com.HackerRank;

import java.util.Scanner;

public class Libarary_Fine {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int d1= sc.nextInt();
        int m1=sc.nextInt();
        int y1=sc.nextInt();
        int d2=sc.nextInt();
        int m2=sc.nextInt();
        int y2=sc.nextInt();


        if(d1>d2 && m1==m2 && y1==y2)
            System.out.println(15*(Math.abs(d1-d2)));
        else if(d1<d2 && m1==m2 && y1==y2){}
        else if(m1>m2 && m1!=m2 && y1==y2)
            System.out.println(500*(Math.abs(m1-m2)));
        else if(y2>y1 && y1!=y2){}
        else if(y2<y1 && y1!=y2)
            System.out.println(10000);
        else{}
    }
}
