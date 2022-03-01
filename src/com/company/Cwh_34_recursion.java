package com.company;

public class Cwh_34_recursion {
    static  int recursion(int  n){
        System.out.println("the recursion in " + n);
        if (n==0 || n==1){
         return 1;
        }
       else {
           return n*recursion(n-1);
        }
    }

    static void Fibonacci(int  n,int a,int b){
        int temp;
        if (n !=0){
//      0,1,1,2,3,5
          int sum =a+b;
          temp=sum; //1 /1
          a=b;//1
          b=temp;//1
          System.out.println(sum);
          Fibonacci(n-1,a,b);
        }
        else {
            System.out.println("stop");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello" );
//        System.out.println( recursion(5));
        Fibonacci(6,0,1);
    }
}
