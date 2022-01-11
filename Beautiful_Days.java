package com.HackerRank;
// 20 23 6 - sample ip , 2 - sample op
import java.util.Scanner;
import java.util.ArrayList;
public class Beautiful_Days {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        int k=sc.nextInt();
        int count=0;double d;
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        for(int b=i;b<=j;b++){
            al2.add(b);
            int rev=0;
            int num=b;
            while(num!=0){
                rev=rev*10 + num%10;
                num=num/10;
            }
            al.add(rev);
            System.out.print(rev+" ");
        }
        System.out.println(al);
        System.out.println(al2);


        for(int m=0;m<al.size();m++){
            int z=al.get(m);    //int z=(int)al.get(m);
            int y=al2.get(m);
            d=Math.abs(z-y);
            d=d/k;
            if(d%1==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
