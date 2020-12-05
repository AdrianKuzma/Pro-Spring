package com.appslab.springbootapp.Address;
import com.appslab.springbootapp.Company.CompanyService;


public class AddressController {
    private AddressService addressService;

    public AddressController(AddressService addressService, CompanyService companyService) {
        this.addressService = addressService;
    }

}
