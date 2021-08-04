package com.example.springboot.thymeleaf.controller;

//import com.example.springboot.thymeleaf.model.Employee; // used for initial phase of building
import com.example.springboot.thymeleaf.dao.EmployeeRepository;
import com.example.springboot.thymeleaf.entities.Employee;
import com.example.springboot.thymeleaf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    //private List<Employee> employees;

    @Autowired
    private EmployeeService employeeService;

    @PostConstruct
    public void load()
    {
//        employees=new ArrayList<>();
//
//        Employee emp1 = new Employee(1, "Leslie", "Andrews", "leslie@luv2code.com");
//        Employee emp2 = new Employee(2, "Emma", "Baumgarten", "emma@luv2code.com");
//        Employee emp3 = new Employee(3, "Avani", "Gupta", "avani@luv2code.com");
//
//        employees.add(emp1);
//        employees.add(emp2);
//        employees.add(emp3);
    }

    @GetMapping("/list")
    public String employeeList(Model model)
    {
        List<Employee> employees=employeeService.findAll();
        model.addAttribute("employees",employees);
        return "employee-list";
    }
    @GetMapping("/showFormForAdd")
    public String showForm(Model model)
    {
        Employee employee = new Employee();
        model.addAttribute("employee",employee);
        return "employee-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("employeeId") int theId,
                                    Model theModel) {

        Employee theEmployee = employeeService.findById(theId);

        theModel.addAttribute("employee", theEmployee);

        return "employee-form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("employee") Employee employee)
    {
        employeeService.save(employee);

        return "redirect:/employees/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("employeeId") int theId) {

        employeeService.deleteById(theId);

        return "redirect:/employees/list";

    }
}
