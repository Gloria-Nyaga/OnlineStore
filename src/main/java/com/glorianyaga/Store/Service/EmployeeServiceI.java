package com.glorianyaga.Store.Service;


import com.glorianyaga.Store.Modules.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeServiceI {
    Employee createEmployee(Employee employee);
    Employee updateEmployee(Integer employeeNumber, Employee employee);
    void deleteEmployee(Integer employeeNumber);
    List<Employee> getAllEmployees();

}
