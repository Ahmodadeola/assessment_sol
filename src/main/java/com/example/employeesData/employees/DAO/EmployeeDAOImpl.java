package com.example.employeesData.employees.DAO;

import com.example.employeesData.employees.Repository.EmployeeRepository;
import com.example.employeesData.employees.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    private EmployeeRepository repository;

    @Override
    public Optional<Employee> getEmployee(long id) {
        return repository.findById(id);
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Iterable<Employee> getEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee deleteEmployee(long id) {
        Optional<Employee> employee = repository.findById(id);
        repository.delete(employee.get());
        return  employee.get();
    }

    @Override
    public boolean updateEmployee(int id, String department) {
        return repository.update(id, department);
    }
}
