package com.appslab.springbootapp;
import com.appslab.springbootapp.Employee.EmployeeService;
import com.appslab.springbootapp.Model.Driver;
import com.appslab.springbootapp.Model.Job;
import com.appslab.springbootapp.Model.Programmer;
import com.appslab.springbootapp.Model.Teacher;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;

@Component
public class DependencyInjectionDemo {
    private EmployeeService x;

    public DependencyInjectionDemo(EmployeeService x) {
        this.x = x;
        Programmer pr1 = new Programmer( 1700 , 200);
        Teacher tc1 = new Teacher( 900 , 300);
        Driver dv1 = new Driver(1000 , 300);
        List<Job> list = Arrays.asList(pr1,tc1,dv1);
        System.out.println(getSum(list));
        x.writeNumber();
    }

    public float getSum(List<Job> list){
        return x.totalBonus(list) + x.totalSalary(list);
    }
}