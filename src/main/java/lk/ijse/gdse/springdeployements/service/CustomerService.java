package lk.ijse.gdse.springdeployements.service;

import lk.ijse.gdse.springdeployements.entity.Customer;
import lk.ijse.gdse.springdeployements.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    public List<Customer> getCustomer() {
        return customerRepo.findAll();
    }

    public void saveCustomer(Customer customer) {
        customerRepo.save(customer);
    }
}