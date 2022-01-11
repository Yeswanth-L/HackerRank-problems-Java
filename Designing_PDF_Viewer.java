package com.HackerRank;

import java.util.Scanner;

public class Designing_PDF_Viewer {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[26];
        for(int i=0;i<26;i++){
            a[i]=sc.nextInt();
        }
        String word=sc.next();
        int product=1,max=0;
        for(int i=0;i<word.length();i++){
            int c=Math.abs(97- word.charAt(i)); // c is the index value
            //97-122 is the ascii value for a to z
            //In this program 0-25 is the ascii value a to z

            int d=a[c];
            if(d>max)
                max=d;

        }
       System.out.println(max*word.length());
    }
}
