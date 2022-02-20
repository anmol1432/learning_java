package com.company;

public class Loops {
    public static void main(String[] args){
        System.out.println("Hello loops");
//        int i = 0;
//        while (i<=5){
//            System.out.println("the value of i : "+ i);
//            i=i+1;
//        }
//        do{
//            System.out.println("the value of i : "+ i);
//            i =i+1;
//        }while (i<=5);
        for (int i= 0; i<=100;i++){
            if (i%2 !=0 ){
                System.out.print("odd : " + i);
                System.out.println("next");
            }
            if(i>=10){
              break;
            }
        }
    }
}