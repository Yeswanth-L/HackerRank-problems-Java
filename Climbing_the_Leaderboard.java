package com.HackerRank;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Climbing_the_Leaderboard {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList al=new ArrayList();
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
        int m=sc.nextInt();
        ArrayList b=new ArrayList();
        for(int i=0;i<m;i++){
           b.add(sc.nextInt());
        }

        //System.out.println(al);
        Set<Integer> s=new LinkedHashSet<>();
        s.addAll(al);
       //add the arraylist element to a set
        al.clear();
        //clear the arraylist
        al.addAll(s);
        //it will add the set element (after removing duplicates)
        Collections.sort(al,Collections.reverseOrder());
        //System.out.println(al);

for(int i=0;i<m;i++){
    al.add(b.get(i));
    // add the element to arraylist
    Collections.sort(al,Collections.reverseOrder()); //again make it in reverse order
    System.out.println(al.indexOf(b.get(i))+1); //index of the added value
    al.remove(b.get(i)); //remove that element
    //old arraylist wil be exist
}

}
    }

