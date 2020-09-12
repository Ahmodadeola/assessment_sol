package com.example.employeesData.employees.Repository;

import com.example.employeesData.employees.Model.Employee;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    @Modifying
    @Query("UPDATE EMPLOYEE SET department = :department WHERE id = :id")
    boolean update(@Param("id") int id, @Param("department") String department);
}
