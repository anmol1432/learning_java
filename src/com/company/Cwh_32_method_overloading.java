package com.company;
import java.util.Arrays;

public class Cwh_32_method_overloading {

    static void joke(){
        System.out.println("joke");
    }
    static int change(int a){
        a =0;
       return a;
    }
    static int[] changeArr(int[] a){
        System.out.println("the actuall array : "+ Arrays.toString(a));
        a[a.length-1] =23;
        System.out.println("after changeArr() call : "+ Arrays.toString(a));
        return a;
    }
    public static void main(String[] args) {
        System.out.println("Method overloading");
        joke();
//       Case 1:  Changing the integer
//        int x = 45;
//        here the value of x is not changing bcz we pass the copy of x not the reference of x
//        change(x);
//        System.out.println("the value of x is : "+x);
//        Case 2:  Changing the array
//        int[] max ={1,2,3,4,5};
//        changeArr(max);
//        in the case of arr the reference is passed and same is the case for object
//        passing to methods.
//        System.out.println("The max array : "+max[4]);
//        case 3:method overloading
        foo();
        foo("Anmol Singh");
        System.out.println("the sum of all : " + sumAll(1,2,3,4));
    }
    static void foo(){
        System.out.println("hello");
    } static void foo(String name){
        System.out.println("hello : "+name);
    }
//    the varargas in java
    static int sumAll(int ...arr){
        int result=0;
//      ...arr is something like that  int [] arr
        for (int item:arr){
            result+=item;
        }
        return result;
    }
}
