package com.appslab.springbootapp.Model;

public enum JobType {
    PROGRAMMER("Programmer"),
    TEACHER("Teacher"),
    DRIVER("Driver");

    public String  name;

    JobType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
