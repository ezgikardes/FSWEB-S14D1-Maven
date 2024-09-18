package com.workintech.developers;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;


    public HRManager(long id, String name, double salary, JuniorDeveloper[] juniorDevelopers, MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);

    }

    @Override
    public void work() {
        setSalary(100000);
        System.out.println("HR Manager starts to working");
    }

    public void setJuniorDevelopers(JuniorDeveloper[] juniorDevelopers) {
        this.juniorDevelopers = juniorDevelopers;
    }

    public void setMidDevelopers(MidDeveloper[] mid) {
        this.midDevelopers = midDevelopers;
    }

    public void setSeniorDevelopers(SeniorDeveloper[] seniorDevelopers) {
        this.seniorDevelopers = seniorDevelopers;
    }

    public void addEmployee(int index, JuniorDeveloper junior) {
        if(index < juniorDevelopers.length){
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = junior;
                System.out.println(junior.getName() + " added as Junior Developer");
            } else {
                System.out.println("Index is full");
            }
        } else {
            System.out.println("Index " + index + " out of bounds for Junior Developers");
        }
    }

    public void addEmployee(int index, MidDeveloper mid) {
            if (index < midDevelopers.length){
            if (midDevelopers[index] == null) {
                midDevelopers[index] = mid;
                System.out.println(mid.getName() + " added as Mid Developer");
            } else {
                System.out.println("Index is full");
            }
            } else {
                System.out.println("Index " + index + " out of bounds for Mid Developers");
            }
    }

    public void addEmployee(int index, SeniorDeveloper senior) {
        if (index < seniorDevelopers.length){
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = senior;
                System.out.println(senior.getName() + " added as Senior Developer");
            } else {
                System.out.println("Index is full");
            }
        } else {
            System.out.println("Index " + index + " out of bounds for Senior Developers");
        }
    }
}



