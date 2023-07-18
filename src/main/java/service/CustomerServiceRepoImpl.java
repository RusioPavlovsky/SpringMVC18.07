package service;

import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.CustomerRepository;

import java.util.List;
@Service
@Transactional
public class CustomerServiceRepoImpl implements CustomerService {
    @Autowired
    CustomerRepository repo;

    public void save(Customer customer) {
        repo.save(customer);
    }

    public List<Customer> listAll() {
        return (List<Customer>) repo.findAll();
    }

    public Customer get(Long id) {
        return repo.findById(id).get();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
