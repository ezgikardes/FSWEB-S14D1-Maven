package com.workintech.developers;

public class JuniorDeveloper extends Employee{

    public JuniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(50000);
        System.out.println("Junior Developer starts to working");
    }
}
