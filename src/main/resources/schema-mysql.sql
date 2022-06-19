/*DROP TABLE IF EXISTS employee;*/
-- DROP TABLE IF EXISTS employeeHealthInsurance;


CREATE TABLE IF NOT EXISTS employee
(
    empId   VARCHAR(10)  NOT NULL,
    empName VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS employeeHealthInsurance
(
    empId                     VARCHAR(10)  NOT NULL,
    healthInsuranceSchemeName VARCHAR(100) NOT NULL,
    coverageAmount            VARCHAR(100) NOT NULL
);