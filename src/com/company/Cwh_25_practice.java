package com.company;

public class Cwh_25_practice {
//            ******
//            *****
//            ****
//            ***
//            **
//            *
    public static void main(String[] args) {
        for (int i=0; i<=5;i++){
            for (int j=0; j<=5-i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
//        to print table
        int theTableOf = 5;
        for (int i=0; i<=10;i++){
            int value = 5 * i;
            System.out.println(i + "*" +theTableOf + ":" + value);
        }

//        find factorial of num
        int n  = 5;
        int i = 1;
        int value = 1;
        while (i<=n){
            value = i * value;
            i = i+1;
        }
        System.out.println(" value : "+value);
    }
}
