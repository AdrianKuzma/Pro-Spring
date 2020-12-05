package com.appslab.springbootapp.Address;

public class AddressServiceImpl implements AddressService {
    private AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public void saveCompany(Address address) {
        addressRepository.save(address);
    }
}