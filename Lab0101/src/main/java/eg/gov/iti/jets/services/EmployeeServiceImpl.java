package eg.gov.iti.jets.services;

import eg.gov.iti.jets.dao.Employee;
import eg.gov.iti.jets.repositories.*;

import jakarta.jws.*;

@WebService(endpointInterface = "eg.gov.iti.jets.services.EmployeeService", name = "NewEmployeeService", serviceName = "NewServie", portName = "NewPort", targetNamespace = "NewTargetNameSpace")
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    @WebMethod(operationName = "New method name")
    public boolean addEmployee(Employee employee) {
        EmployeeRepository employeeRepositoryImpl = new EmployeeRepositoryImpl();
        employeeRepositoryImpl.addEmployee(employee);
        return true;
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        EmployeeRepository employeeRepositoryImpl = new EmployeeRepositoryImpl();
        employeeRepositoryImpl.updateEmployee(employee);
        return true;
    }

    @Override
    public boolean deleteEmployee(int id) {
        EmployeeRepository employeeRepositoryImpl = new EmployeeRepositoryImpl();
        employeeRepositoryImpl.deleteEmployee(id);
        return true;
    }

    @Override
    @WebResult(header=true)
    public Employee getEmployee(@WebParam(name = "empID") int id) {
        EmployeeRepository employeeRepositoryImpl = new EmployeeRepositoryImpl();
        Employee employee = employeeRepositoryImpl.getEmployee(id);

        return employee;
    }
}
