package com.asem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import jakarta.ws.rs.client.*;
import jakarta.ws.rs.core.MediaType;

import com.ahmed.rest.model.*;

public class EmployeeDaoImplTest {
    
    @BeforeAll
    static void initAll() {
        
        System.out.println("before all");
    }

    @BeforeEach
    void init() {
        System.out.println("before each");

    }

    @AfterEach
    void tearDown() {
        System.out.println("after each");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("after all");
    }

    // @Test
    // public void testAddEmployee() {
    //     System.out.println("test case add employee");
    //     Employee employee = new Employee();
    //     employee.setFirstName("Ahmed");
    //     employee.setLastName("Asim");
    //     try {
    //         assertTrue(consumerService.addEmployee(employee), "Cannot add emp!!");
    //     } catch (Exception e) {
    //         fail("Cannot add emp!!");
    //     }
    // }

    // @Test
    // public void testUpdateEmployee() {
    //     System.out.println("test case update employee");
    //     Employee employee = new Employee();
    //     employee.setId(15);
    //     employee.setFirstName("Aboelsayed");
    //     employee.setLastName("Asim");
    //     try {
    //         assertTrue(consumerService.updateEmployee(employee), "Cannot update emp!!");
    //     } catch (Exception e) {
    //         fail("Cannot update emp!!");
    //     }
    // }

    // @Test
    // @Disabled
    // public void testDeleteEmployee() {
    //     System.out.println("test case delete employee");

    //     try {
    //         assertTrue(consumerService.deleteEmployee(23), "Cannot delete emp!!");
    //     } catch (Exception e) {
    //         fail("Cannot delete emp!!");
    //     }
    // }

    @Test
    public void testGetEmployee() {
        Client client = ClientBuilder.newClient();

        // Employee employee = client.target("http://localhost:9191/Lab0201_Test/api/emp")
        //                         .path("{id}").resolveTemplate("id",4)
        //                         .request(MediaType.APPLICATION_JSON).get(Employee.class);
                                List<Employee> employee = client.target("http://localhost:9191/Lab0201_Test/api/emp")
                                // .path("{id}").resolveTemplate("id",4)
                                .request(MediaType.APPLICATION_JSON).get(Employee.class);

        // System.out.println(employee);
    }
}

