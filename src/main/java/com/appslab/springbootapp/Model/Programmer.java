package com.appslab.springbootapp.Model;

public class Programmer extends Job {

    public Programmer(float salary, int bonus) {
        super(salary, bonus, JobType.PROGRAMMER);
    }

    @Override
    public String getInfo() {
        return jobtype.name + "'s salary is " + (salary + bonus);
    }
}
