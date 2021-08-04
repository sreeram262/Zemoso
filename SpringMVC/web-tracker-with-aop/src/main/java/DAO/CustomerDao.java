package DAO;

import entities.Customer;

import java.util.List;

public interface CustomerDao {

    public List<Customer> getCustomers();

    void saveCustomer(Customer customer);

    Customer getCustomer(int theId);

    void delete(Customer theCustomer);
}
