package com.appslab.springbootapp.Model;
import javax.persistence.Entity;

@Entity
public class Programmer extends Job {

    public Programmer(int id, float salary, int bonus) {
        super(id,salary, bonus, JobType.PROGRAMMER);
    }

    @Override
    public String getInfo() {
        return jobtype.name + "'s salary is " + (salary + bonus);
    }
}
