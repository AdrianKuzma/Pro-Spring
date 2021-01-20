package com.appslab.springbootapp.Model;
import com.appslab.springbootapp.Company.Company;

import javax.persistence.Entity;

@Entity
public class Teacher extends Job {

    public Teacher(float salary, int bonus, int companyID) {
        super(salary, bonus, companyID,JobType.TEACHER);
    }

    public Teacher(float salary, int bonus, Company company) {
        super(salary, bonus, company,JobType.TEACHER);
    }

    public Teacher() {
        super(JobType.TEACHER);
    }
}
