package com.appslab.springbootapp.Model;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.*;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "jobType"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Driver.class, name = "Driver"),
        @JsonSubTypes.Type(value = Programmer.class, name = "Programmer"),
        @JsonSubTypes.Type(value = Teacher.class, name = "Teacher")
})

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "jobType", discriminatorType = DiscriminatorType.STRING)
public class Job {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;

    float salary;
    int bonus;

    @Enumerated(EnumType.STRING)
    @Column(name = "jobType", nullable = false,insertable = false,updatable = false)
    JobType jobtype;

    public Job(int id,float salary, int bonus, JobType jobtype) {
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
        this.jobtype = jobtype;
    }

    public Job(){

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void setJobtype(JobType jobtype) {
        this.jobtype = jobtype;
    }

    public int getId() {
        return id;
    }

    public JobType getJobtype() {
        return jobtype;
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
