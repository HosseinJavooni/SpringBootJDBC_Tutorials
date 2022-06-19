package com.javainuse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javainuse.dao.HealthInsuranceDao;
import com.javainuse.model.EmployeeHealthInsurance;
import com.javainuse.service.HealthInsuranceService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class HealthInsuranceServiceImpl implements HealthInsuranceService {

    @Autowired
    HealthInsuranceDao healthInsuranceDao;

    @Override
    public void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance) {
        healthInsuranceDao.registerEmployeeHealthInsurance(employeeHealthInsurance);
    }

    @Override
    public void deleteEmployeeHealthInsuranceById(String empid) {
        healthInsuranceDao.deleteEmployeeHealthInsuranceById(empid);
    }

}