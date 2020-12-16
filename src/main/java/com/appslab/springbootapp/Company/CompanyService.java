package com.appslab.springbootapp.Company;

import java.util.Optional;

public interface CompanyService {
    void saveCompany(Company company);
    Optional<Company> findById(Integer id);
    void findAll();
}
