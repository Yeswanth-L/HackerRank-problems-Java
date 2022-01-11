package com.HackerRank;

/* Index of indexes
3
2 3 1
o/p:
2
3
1
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sequence_Equation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Integer> p=new ArrayList<>();
       for(int i=0;i<n;i++){
           p.add(sc.nextInt());
       }
        List<Integer> a=new ArrayList<>();
        for(int i=1;i<=p.size();i++){
            for(int j=0;j<p.size();j++){
                if(i==p.get(j))
                    a.add(j+1);
            }
        }
        System.out.println(a);

        for(int i=0;i<p.size();i++){
            for(int j=0;j<p.size();j++){
                if(a.get(i)==p.get(j))
                    System.out.println(j+1);
            }
        }

    }
}
