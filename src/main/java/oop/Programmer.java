package oop;

import oop.Human;

public class Programmer implements Human {
    private String name;
    private int age;
    private int salary;

    public Programmer(String name, int age, int salary) {
        this.name= name;
        this.age=age;
        this.salary = salary;
    }

    public String say(){
        return String.format("My name is %s, I'm %s years old. I'm programmer, my salary is %s", name, age,salary);
    }
}
