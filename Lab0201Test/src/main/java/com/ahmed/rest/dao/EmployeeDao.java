package com.ahmed.rest.dao;


import com.ahmed.rest.model.*;
import java.util.*;

public interface EmployeeDao {

    
    public Employee addEmployee(Employee employee);

    
    public Employee findEmployee(int id);

    
    public String deleteEmployee(Employee employee);

    
    public Employee updateEmployee(Employee employee);


    public List<Employee> findAllEmployees();
    
    
}
