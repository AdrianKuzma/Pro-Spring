package com.appslab.springbootapp.Model;
import javax.persistence.Entity;

@Entity
public class Teacher extends Job {

    public Teacher(int id,float salary, int bonus) {
        super(id,salary, bonus, JobType.TEACHER);
    }

}
