package com.company;

import java.util.Scanner;

public class Some_test_runs {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        if (++x < y--) {
            System.out.println("A");
        } else if (x++ == --y) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }

        System.out.println("x: " + x);
        System.out .println("y: " + y);
        float a = 7/4*9/2;
        System.out.println(a);
        char b = 'A';
                b=(char)(b+8);
        System.out.println(b);
                b=(char)(b-8);
        System.out.println(b);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num>0){
            System.out.println("the given number is positive number");
        }else{
            System.out.println("the given number is negetive number");
        }
        int d = 7*49/7+35/7;
        System.out.println(d);
    }
}

