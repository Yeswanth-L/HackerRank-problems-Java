package com.HackerRank;
import java.util.Scanner;
public class PickingNumbers1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[101];
        int d,e=0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        for(int j=0;j<n;j++){
                int index=a[j];
                    b[index]++;

        }

        for(int i=0;i<100;i++){
        if(b[i]-b[i+1] <= 1){
            d=b[i]+b[i+1];
            if(d>e)
                e=d;
        }
        }System.out.println(e);
    }
}
/*6
1 2 2 3 1 2*/