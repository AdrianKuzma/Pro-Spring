package com.appslab.springbootapp.Company;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
public class CompanyController {
    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping("/company")
    public void test(@RequestBody Company company) {
        companyService.saveCompany(company);
    }

    @GetMapping("/company/{id}")
    public Optional<Company> test2(@PathVariable Integer id){
        return companyService.findById(id);
    }

    @GetMapping("/company")
    public void test3(){
        companyService.findAll();
    }
}