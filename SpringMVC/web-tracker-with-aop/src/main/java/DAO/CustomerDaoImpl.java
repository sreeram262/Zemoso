package DAO;

import entities.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers() {

        Session session=sessionFactory.getCurrentSession();
        Query<Customer> theQuery=session.createQuery("from Customer order by lastName",Customer.class);

        List<Customer> customers=theQuery.getResultList();

        return customers;
    }

    @Override
    public void saveCustomer(Customer customer) {

        Session session=sessionFactory.getCurrentSession();

        session.saveOrUpdate(customer);

    }

    @Override
    public Customer getCustomer(int theId) {
        Session session=sessionFactory.getCurrentSession();
        Customer customer=session.get(Customer.class,theId);
        return customer;
    }

    @Override
    public void delete(Customer theCustomer) {
        Session session=sessionFactory.getCurrentSession();
        session.delete(theCustomer);

    }
}
