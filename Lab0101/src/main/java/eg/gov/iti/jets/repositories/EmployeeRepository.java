package eg.gov.iti.jets.repositories;

import eg.gov.iti.jets.dao.Employee;

public interface EmployeeRepository {
    void addEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployee(int id);

    Employee getEmployee(int id);
}
