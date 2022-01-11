package com.HackerRank;

import java.util.Scanner;

public class Cat_Mouse12 {
    static void result(int x, int y, int z) {
        int a = z - x;
        int b = z - y;
        a = Math.abs(a);
        b = Math.abs(b);
        if (a > b)
            System.out.println("Cat B");
        else if (a == b)
            System.out.println("Mouse C");
        else
            System.out.println("Cat A");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        for (int i = 0; i < s; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            result(x, y, z);
        }

    }

}