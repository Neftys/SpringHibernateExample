package com.websystique.springmvc;

import com.websystique.springmvc.configuration.HibernateConfiguration;
import com.websystique.springmvc.dao.EmployeeDao;
import com.websystique.springmvc.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Created by Ниф on 07.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HibernateConfiguration.class);

        EmployeeDao employeeDao = (EmployeeDao)applicationContext.getBean("sessionFactory");

        List<Employee> allEmployees = employeeDao.findAllEmployees();
        for (Employee employee : allEmployees) {
            System.out.println(employee.toString() + '\n');
        }

    }
}
