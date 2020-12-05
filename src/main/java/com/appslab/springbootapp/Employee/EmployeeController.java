package com.appslab.springbootapp.Employee;
import com.appslab.springbootapp.Model.Driver;
import com.appslab.springbootapp.Model.Job;
import com.appslab.springbootapp.Model.Programmer;
import com.appslab.springbootapp.Model.Teacher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {
    private EmployeeService x;
    Programmer pr1 = new Programmer( 1700 , 200);
    Teacher tc1 = new Teacher( 900 , 300);
    Driver dv1 = new Driver(1000 , 300);
    List<Job> list = Arrays.asList(pr1,tc1,dv1);

    public EmployeeController(EmployeeService x) {
        this.x = x;
    }

    @GetMapping("/hello")
    public String greeting() {
        return "Hello Spring Boot";
    }
    @GetMapping("/salary")
    public float totalSalary(){
        return x.totalSalary(list);
    }
    @GetMapping("/bonus")
    public float totalBonus(){
        return x.totalBonus(list);
    }
    @GetMapping("/snail")
    public float snail(@RequestParam float sH,@RequestParam float sL,@RequestParam float tH){
        return tH / sH * (sH + sL);
    }
}
