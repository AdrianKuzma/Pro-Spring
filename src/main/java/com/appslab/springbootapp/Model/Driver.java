package com.appslab.springbootapp.Model;
import com.appslab.springbootapp.Company.Company;
import javax.persistence.Entity;

@Entity
public class Driver extends Job {

    public Driver(float salary, int bonus, int companyID) {
        super(salary, bonus, companyID, JobType.DRIVER);
    }

    public Driver(float salary, int bonus, Company company) {
        super(salary, bonus, company, JobType.DRIVER);

    }
    public Driver() {
        super(JobType.DRIVER);
    }

}