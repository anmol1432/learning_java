package com.company;

public class StrMethod {
//   a simple method which is only run in StrMethod()S class
    public static String myMethod(String name){
     System.out.println(name);
     return name;
    }
    public static void main(String[]args){
        myMethod("Anmol singh");
        String name = "monu singh  ";
        System.out.println(name.toUpperCase());
        System.out.println(name.trim().toUpperCase());
        System.out.println(name.substring(10));
        System.out.println(name.replace("on", "oj").trim());
        System.out.println(name.startsWith("mo"));
        System.out.println(name.indexOf('n'));
    }
}
