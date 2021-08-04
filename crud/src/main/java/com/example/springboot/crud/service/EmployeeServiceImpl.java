package com.example.springboot.crud.service;

import com.example.springboot.crud.dao.EmployeeDao;
import com.example.springboot.crud.dao.EmployeeRepository;
import com.example.springboot.crud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeDao;
    //no need to use if we are using springboot data jpa
//    @Qualifier("employeeDAOJpaImpl") //  @Qualifier("employeeDAOHibernateImpl")
//    private EmployeeDao employeeDao;

    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    @Transactional
    public Employee findById(int theId) {
        //return employeeDao.findById(theId); //for other implementations


        Optional<Employee> result = employeeDao.findById(theId);

        Employee theEmployee = null;

        if (result.isPresent()) {
            theEmployee = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + theId);
        }

        return theEmployee;

    }

    @Override
    @Transactional
    public void save(Employee theEmployee) {
        employeeDao.save(theEmployee);

    }

    @Override
    @Transactional
    public void deleteById(int theId) {

        employeeDao.deleteById(theId);
    }
}
