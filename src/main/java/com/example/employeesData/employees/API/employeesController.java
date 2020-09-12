package com.example.employeesData.employees.API;

import com.example.employeesData.employees.Service.EmployeeService;
import com.example.employeesData.employees.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RequestMapping("api/v1/employee")
@RestController
public class employeesController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public Iterable<Employee> getAll(){
        return employeeService.getAll();
    }

    @GetMapping(path = "{id}")
    public Optional<Employee> getEmployee(@PathVariable("id") long id){
        return employeeService.getEmployee(id);
    }


    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @PutMapping(path = "{id}")
    public boolean updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id, employee.getDepartment());
    }

    @DeleteMapping(path = "{id}")
    public Employee deleteEmployee(@PathVariable("id") int id){
        return employeeService.deleteEmployee(id);
    }

}
