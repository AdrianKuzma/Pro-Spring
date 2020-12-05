package com.appslab.springbootapp.Company;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    private CompanyService companyService;


    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/company")
    public void test() {
        Company name = new Company();
        name.setName("Drákula");
        companyService.saveCompany(name);
    }
}