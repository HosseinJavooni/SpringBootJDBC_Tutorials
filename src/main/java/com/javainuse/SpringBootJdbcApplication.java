package com.javainuse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.javainuse.model.Employee;
import com.javainuse.model.EmployeeHealthInsurance;
import com.javainuse.service.OrganizationService;

@SpringBootApplication
public class SpringBootJdbcApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);
        OrganizationService organizationService = context.getBean(OrganizationService.class);

        Employee emp = new Employee();
        emp.setEmpId("emp1");
        emp.setEmpName("emp1");

        EmployeeHealthInsurance employeeHealthInsurance = new EmployeeHealthInsurance();
        employeeHealthInsurance.setEmpId("emp1");
        employeeHealthInsurance.setHealthInsuranceSchemeName("premium");
        employeeHealthInsurance.setCoverageAmount(20000);

        organizationService.joinOrganization(emp, employeeHealthInsurance);
    }
}