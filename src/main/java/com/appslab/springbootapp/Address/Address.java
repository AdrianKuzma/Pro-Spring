package com.appslab.springbootapp.Address;
import javax.persistence.*;

@Entity
public class Address {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String street;
    private int zipCode;
    private String city;
    private String state;

    public Address() {
    }

    public Address(int id, String street, int zipCode, String city, String state) {
        this.id = id;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }
}
