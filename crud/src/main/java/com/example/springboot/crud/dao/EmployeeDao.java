package com.example.springboot.crud.dao;

import com.example.springboot.crud.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> findAll();

    Employee findById(int theId);

    void save(Employee theEmployee);

    void deleteById(int theId);
}
