package com.company;
import java.util.Scanner;


// Learning Strings
public class Str {
    public static void main(String[] args){
        int a = 22;
        int c = 33;
        float b = 22.0f;
        Scanner sc = new Scanner(System.in);
        String name = new String("Anmol");
        System.out.printf("\n %d + %d the value of A is a  and B is %f",a,c,b);
        System.out.format("\n %d the value of A is a  and B is %f",a,b);
        System.out.println(name.length());
        String nm = sc.nextLine();
        System.out.println(nm.toUpperCase());
    }
}
