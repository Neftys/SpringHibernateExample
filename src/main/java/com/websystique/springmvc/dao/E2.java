package com.websystique.springmvc.dao;

import com.websystique.springmvc.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ниф on 07.11.2016.
 */
@Repository
public class E2 implements EmployeeDao {
    @Override
    public Employee findById(int id) {
        return null;
    }

    @Override
    public void saveEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployeeBySsn(String ssn) {

    }

    @Override
    public List<Employee> findAllEmployees() {
        return null;
    }

    @Override
    public Employee findEmployeeBySsn(String ssn) {
        return null;
    }
}
