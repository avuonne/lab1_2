package org.example;

public class Main {
    public static void main(String[] args) {
        final int a = 14;
        final int b = 7;
        System.out.println("Наибoльший общий делитель = " + gcd(a,b));
    }

    public static int gcd(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
}