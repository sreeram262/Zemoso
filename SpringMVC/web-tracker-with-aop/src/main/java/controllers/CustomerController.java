package controllers;

import DAO.CustomerDao;
import entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import services.CustomerService;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @GetMapping("/list")
    public String listCustomers(Model model)
    {
        List<Customer> theCustomers = customerService.getCustomers();

        model.addAttribute("customers",theCustomers);
        return "list-customer";
    }

    @GetMapping("/showFormForAdd")
    public  String showAddForm(Model model)
    {
        Customer theCustomer = new Customer();

        model.addAttribute("customer", theCustomer);
        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer)
    {
        customerService.saveCustomer(customer);
        return "redirect:/customer/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("customerId") int theId,
                                    Model theModel) {

        // get the customer from our service
        Customer theCustomer = customerService.getCustomer(theId);

        // set customer as a model attribute to pre-populate the form
        theModel.addAttribute("customer", theCustomer);

        // send over to our form
        return "customer-form";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("customerId") int theId) {

        // get the customer from our service
        Customer theCustomer = customerService.getCustomer(theId);

        customerService.delete(theCustomer);

        return "redirect:/customer/list";
    }

}
