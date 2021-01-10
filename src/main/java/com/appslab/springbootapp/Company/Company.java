package com.appslab.springbootapp.Company;
import com.appslab.springbootapp.Address.Address;
import com.sun.istack.NotNull;

import javax.persistence.*;


@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @NotNull
    private Address address;

    public Company() {
    }

    public Company(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
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
