package com.ahmed.rest.controller;

import com.ahmed.rest.dao.EmployeeDao;
import com.ahmed.rest.dao.EmployeeDaoImp;
import com.ahmed.rest.model.*;
import java.util.*;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

import jakarta.ws.rs.core.*;
import com.ahmed.rest.exception.ResourceNotFoundException;
import java.util.*;



@Path("emp")
@Produces({"application/json","application/xml"})
@Consumes({"application/json","application/xml"})
public class EmployeeController {
    EmployeeDao dao = new EmployeeDaoImp();

    @GET
    @Path("{eid}")
    public Response getEmployeeById(@PathParam("eid")int id, @Context UriInfo uriInfo){
        Employee employee = dao.findEmployee(id);
        if(employee == null) {
            throw new ResourceNotFoundException("Employee with ID: " + id + "Not found");
        }
        return Response.ok().entity(employee).build();
    }
    @GET
    public Response getAllEmplyees(@Context UriInfo uriInfo){
        List<Employee> employees = dao.findAllEmployees();

        employees.forEach(employee -> {
            // UriBuilder uriBuilder = uriInfo.getRequestUriBuilder();
            // uriBuilder = uriBuilder.path(Integer.toString(employee.getId()));
            // Link.Builder linkBuilder = Link.fromUriBuilder(uriBuilder);
            // Link selfLink = linkBuilder.rel("self").build();
            LinkClass selfLink = new LinkClass();
            selfLink.setLink(uriInfo.getAbsolutePathBuilder().toString());
            selfLink.setRelation("self");
            employee.setLinks(Arrays.asList(selfLink));
        });

        GenericEntity<List<Employee>> gemployees = new GenericEntity<>(employees) {

        };

        return Response.ok().entity(gemployees).build();
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
