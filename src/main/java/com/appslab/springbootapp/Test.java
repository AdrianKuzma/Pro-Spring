package com.appslab.springbootapp;
import org.springframework.stereotype.Component;

@Component
public class Test {
    private EmployeeService x;

    public Test(EmployeeService x) {
        this.x = x;
        x.writeNumber();
    }
}
