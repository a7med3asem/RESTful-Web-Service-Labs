package com.ahmed.rest.controller;

import com.ahmed.rest.dao.EmployeeDao;
import com.ahmed.rest.dao.EmployeeDaoImp;
import com.ahmed.rest.model.Employee;
import java.util.*;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("emp")
@Produces({"application/json","application/xml"})
@Consumes({"application/json","application/xml"})
public class EmployeeController {
    EmployeeDao dao = new EmployeeDaoImp();

    @GET
    @Path("{eid}")
    public Employee getEmployeeById(@PathParam("eid")int id){
        return dao.findEmployee(id);
    }
    @GET
    public List<Employee> getAllEmplyees(){
        return dao.findAllEmployees();
    }

    @POST
    public Employee addEmployee(Employee employee){
        return dao.addEmployee(employee);
    }
    @DELETE
    public String deleteEmployee(Employee employee){
        return dao.deleteEmployee(employee);
    }
    @PUT
    public Employee updateEmployee(Employee employee){
        return dao.updateEmployee(employee);
    }

    
}
