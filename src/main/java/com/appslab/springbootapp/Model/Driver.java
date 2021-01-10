package com.appslab.springbootapp.Model;
import javax.persistence.Entity;

@Entity
public class Driver extends Job {

    public Driver(int id,float salary, int bonus) {
        super(id, salary, bonus, JobType.DRIVER);
    }

}
