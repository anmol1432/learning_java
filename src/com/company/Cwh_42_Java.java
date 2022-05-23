package com.company;
import java.util.Scanner;

class MyEmp{
    public int id;
    private final String salary;
    Scanner sc= new Scanner(System.in);

    // Constructors
    public MyEmp(int id, String salary){
        this.id =id;
        this.salary=salary;
    }

    public void getSalary(){
        System.out.println("The salary is $ "+this.salary);
    }
    public void getId(){
        System.out.println("The id is "+this.id);
    }
    public void setId(int newId){
        this.id=newId;
        System.out.println(String.format("id is updated id is %s",this.id));
    }
}

public class Cwh_42_Java {
    public static void main(String[] args) {
        MyEmp emp= new MyEmp(2,"3003332323230");
        System.out.println(emp.id);
/* without the help of constructor you have to emp.setId(5) to set id */
        emp.getId();
        emp.getSalary();
    }
}
