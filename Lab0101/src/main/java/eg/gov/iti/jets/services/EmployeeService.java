package eg.gov.iti.jets.services;

import eg.gov.iti.jets.dao.Employee;

import jakarta.jws.*;

@WebService
public interface EmployeeService {
    
    boolean addEmployee(Employee employee);

    @WebMethod(operationName = "UpdateMethod")
    boolean updateEmployee(Employee employee);

    @WebMethod(exclude = true)
    boolean deleteEmployee(int id);

    @WebResult(header=true, name = "Retrieve result")
    Employee getEmployee(int id);
}
