package com.appslab.springbootapp.Company;
import com.appslab.springbootapp.Address.Address;

import javax.persistence.*;


@Entity
public class Company {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String name;
    @OneToOne
    private Address address;

    public Company() {
    }

    public Company(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
    }
}
