package com.HackerRank;
import java.util.HashSet;
import java.util.Scanner;
public class String_Construction {
    static void Class1(String s) {
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++) {
            hs.add(s.charAt(i));
        }
        System.out.println(hs.size());
    }
            public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                String s=sc.next();
                Class1(s);
            }
        }
    }
