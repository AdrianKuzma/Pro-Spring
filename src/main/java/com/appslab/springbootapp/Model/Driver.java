package com.appslab.springbootapp.Model;

public class Driver extends Job {

    public Driver(float salary, int bonus) {
        super(salary, bonus, JobType.DRIVER);
    }

}
