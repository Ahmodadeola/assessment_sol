package com.example.employeesData.employees.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

public class Employee {
    @Id
    private long id;

    private String name;
    private String department;

    public Employee(@JsonProperty("name") String name, @JsonProperty("department") String department) {
        this.name = name;
        this.department = department;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

