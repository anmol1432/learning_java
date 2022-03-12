package com.company;

// learning how to create classes in java
class Employee{
    int id;
    String name;
    int salary=0;
    public void generateSalary(){
        System.out.println("current salary $"+salary);
    }
    public void empDetails(){
        System.out.println("the id is : "+id);
        System.out.println("the name is : "+name);
    }
}

public class Cwh_38_customClass {
    public static void main(String[] args) {
//      Instantiating upper employee class
        Employee emp = new Employee();
        emp.id=12;
        emp.name="Anmol Singh";
        emp.salary=5000;
        emp.empDetails();
        emp.generateSalary();
    }
}