package com.appslab.springbootapp.Model;

public class Job {
    float salary;
    int bonus;
    JobType jobtype;

    public Job(float salary, int bonus, JobType jobtype) {
        this.salary = salary;
        this.bonus = bonus;
        this.jobtype = jobtype;
    }

    public String getInfo(){
        return jobtype.name + "'s salary is " + salary + " and bonus is " + bonus;
    }

    public float getSalary() {
        return salary;
    }

    public int getBonus() {
        return bonus;
    }
}
