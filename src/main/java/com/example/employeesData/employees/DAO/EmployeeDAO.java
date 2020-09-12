package com.example.employeesData.employees.DAO;

import com.example.employeesData.employees.Model.Employee;

import java.util.Optional;

public interface EmployeeDAO {
    Optional<Employee> getEmployee(long id);
    Employee createEmployee(Employee employee);
    Iterable<Employee> getEmployees();
    Employee deleteEmployee(long id);
    boolean updateEmployee(int id, String department);
}
