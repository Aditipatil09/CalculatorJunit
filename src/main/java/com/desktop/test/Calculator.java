package com.desktop.test;

public class Calculator {
    public static int addTwoNumbers(int a ,int b){
        return a+b ;
    }

    public static int productTwoNumbers(int a , int b){
        return a*b;
    }
    public static double DivideTwoNumbers(int a , int b){
        return a/b;
    }

    public static int sumAnyNumbers( int...numbers){
        int s=0;
        for(int n: numbers){
            s+=n;
        }
        return s;

    }

}
