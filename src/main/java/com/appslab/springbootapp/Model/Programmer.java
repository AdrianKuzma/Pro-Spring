package com.appslab.springbootapp.Model;
import com.appslab.springbootapp.Company.Company;

import javax.persistence.Entity;

@Entity
public class Programmer extends Job {

    public Programmer(float salary, int bonus, int companyID) {
        super(salary, bonus, companyID,JobType.PROGRAMMER);
    }

    public Programmer(float salary, int bonus, Company company) {
        super(salary, bonus, company,JobType.PROGRAMMER);
    }

    public Programmer() {
        super(JobType.PROGRAMMER);
    }

    @Override
    public String getInfo() {
        return jobtype.name + "'s salary is " + (salary + bonus);
    }
}
