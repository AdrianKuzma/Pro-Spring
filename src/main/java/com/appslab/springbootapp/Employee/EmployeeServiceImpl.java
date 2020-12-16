package com.appslab.springbootapp.Employee;
import com.appslab.springbootapp.Model.Job;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    int number = 0;
    @Override
    public float totalSalary(List<Job> list) {
        return list.stream().mapToInt(i -> (int) i.getSalary()).sum();
    }

    @Override
    public int totalBonus(List<Job> list) {
        return list.stream().mapToInt(Job::getBonus).sum();
    }

    @Override
    public void writeNumber() {
        System.out.println(++number);
    }

    @Override
    public void saveJob(Job job) {
        employeeRepository.save(job);
    }
}
