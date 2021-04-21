package com.ahmed.rest.dao;

import com.ahmed.rest.model.Employee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeDaoImp implements EmployeeDao{
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("rest");
    EntityManager em = emf.createEntityManager();


    @Override
    public Employee addEmployee(Employee employee){
        em.getTransaction().begin();
        em.persist(employee);
        em.getTransaction().commit();
        return employee;
    }

    @Override
    public Employee findEmployee(int id){
        em.getTransaction().begin();
        Employee employee =em.find(Employee.class,id);
        em.getTransaction().commit();
        return employee;
    }

    @Override
    public String deleteEmployee(Employee employee){
        Employee emp = em.find(Employee.class,employee.getId());
        em.getTransaction().begin();
        em.remove(emp);
        em.getTransaction().commit();
        return "deletion done!";
    }

    @Override
    public Employee updateEmployee(Employee employee){
        em.getTransaction().begin();
        //merge automatically fetches then updates object
        Employee emp = em.merge(employee);
        em.getTransaction().commit();
        return emp;
    }

    @Override
    public List<Employee> findAllEmployees() {
        em.getTransaction().begin();

        List<Employee> emps=(List<Employee>) em.createQuery("from Employee").getResultList();

        return emps;
    }
    
    
}
