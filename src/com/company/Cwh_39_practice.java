package com.company;

class Emp{
    String name="Anmol";
    String salary="0";
    public void getSalary(){
        System.out.println("The salary is $ "+salary);
    }
    public void getName(){
        System.out.println("The name is "+name);
    }
    public void setName(String newName){
        name=newName;
        System.out.println(String.format("Name is updated name is %s",name));
    }
}

public class Cwh_39_practice {
    public static void main(String[] args) {
        Emp emp = new Emp();
        emp.getSalary();
        emp.setName("Anmol Singh");
        emp.getName();
    }
}
