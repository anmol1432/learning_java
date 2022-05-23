package com.company;

public class Cwh_26_Array {
    public static void main(String[] args) {
//      datatype [] var = new datatype [memory Size];
//      there are many to intialize an array
        int [] marks = new int[5];
        marks[0]=99;
        marks[1]=9;
        marks[2]=2;
        marks[3]=33;
        marks[4]=33;

        int [] num = {1,2,3,4};    //assigning values to array
        int [] code = new int[5]; //memory allocation
        code[1] = 123;
        code[3]=1234;
        System.out.println(marks[4] + marks[2]);
        System.out.println("code[1] : " + code[2]);
        System.out.println("num[0] : " + num[0]);
    }
}
