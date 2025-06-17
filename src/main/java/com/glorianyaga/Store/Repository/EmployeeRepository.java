package com.glorianyaga.Store.Repository;


import com.glorianyaga.Store.Modules.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}
