package com.workintech.developers;

public class SeniorDeveloper extends Employee{

    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(100000);
        System.out.println("Senior Developer starts to working");
    }
}
