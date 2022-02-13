package com.company;
import java.util.Scanner;

public class Cwh_18_else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = sc.nextInt();
        if (age > 50){
            System.out.println("You are experienced");
        }
        else if(age>40){
            System.out.println("You are quiet experienced");
        }
        else {
            System.out.println("Not experienced");
        }
        switch (age) {
            case (18) -> {
                System.out.println("you are young");
            }
            case (25) -> {
                System.out.println("you are adult");
            }
            case (60) -> {
                System.out.println("you are old");
            }
            default -> {
                System.out.println("you are dead");
            }
        }
    }
}
