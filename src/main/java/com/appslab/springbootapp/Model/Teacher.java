package com.appslab.springbootapp.Model;

public class Teacher extends Job {

    public Teacher(float salary, int bonus) {
        super(salary, bonus, JobType.TEACHER);
    }

}
