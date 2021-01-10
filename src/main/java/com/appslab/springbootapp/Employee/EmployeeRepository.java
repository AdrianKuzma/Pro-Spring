package com.appslab.springbootapp.Employee;
import com.appslab.springbootapp.Model.Job;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Job, Integer> {
}
