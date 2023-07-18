package service;

import model.Customer;

import java.util.List;

public interface CustomerService {
    public void save(Customer customer);
    public List<Customer> listAll();
    public Customer get (Long id);
    public void delete(Long id);

}
