package com.example.employeesData.employees.Service;

import com.example.employeesData.employees.DAO.EmployeeDAOImpl;
import com.example.employeesData.employees.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDAOImpl employeeDAO;

    public Iterable<Employee> getAll(){
        return employeeDAO.getEmployees();
    }

    public Optional<Employee> getEmployee(long id){
        return employeeDAO.getEmployee(id);
    }

    public Employee addEmployee(Employee employee){
        return employeeDAO.createEmployee(employee);
    }

    public boolean updateEmployee(int id, String department){
        return employeeDAO.updateEmployee(id, department);
    }

    public Employee deleteEmployee(int id){
        return employeeDAO.deleteEmployee(id);
    }
}
