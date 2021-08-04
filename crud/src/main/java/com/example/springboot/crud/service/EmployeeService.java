package com.example.springboot.crud.service;

import com.example.springboot.crud.entity.Employee;

import java.util.List;


public interface EmployeeService {
    public List<Employee> findAll();

    public Employee findById(int theId);

    public void save(Employee theEmployee);

    public void deleteById(int theId);
}
