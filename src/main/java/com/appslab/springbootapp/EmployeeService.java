package com.appslab.springbootapp;
import com.appslab.springbootapp.Model.Job;
import java.util.List;


public interface EmployeeService {
    float totalSalary(List<Job> list);
    int totalBonus(List<Job> list);
    void writeNumber();
}
