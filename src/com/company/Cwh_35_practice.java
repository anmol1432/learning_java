package com.company;

public class Cwh_35_practice {
    static void printStar(int n,String star) {
        if (n != 0) {
            for (int i = 0; i < n; i++) {
                System.out.println(star);
                star = star + "*";
            }
        }
    }
    public static void main(String[] args) {
        printStar(5,"*");
    }
}
