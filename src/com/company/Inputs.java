package com.company;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        System.out.println("Take input from user");
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = scaner.nextInt();
        System.out.println("Enter number 2");
        int num2 = scaner.nextInt();
        int answer = num1 + num2;
        System.out.print("Sum of two number is  ");
        System.out.print(answer);
        String tip = scaner.nextLine();
    }
}
