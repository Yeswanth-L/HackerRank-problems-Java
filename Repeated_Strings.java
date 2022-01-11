package com.HackerRank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Repeated_Strings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next(),a="";
        int n=10,c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<s.length();j++){
                if(c==n)
                    break;
                a=a+s.charAt(j);
                c++;
            }
        }

        HashSet<Character> hs=new HashSet<>();
        ArrayList<Character> al=new ArrayList<>();
        for(int i=0;i<s.length();i++)
            hs.add(s.charAt(i));


        System.out.println(hs);
    }
}
