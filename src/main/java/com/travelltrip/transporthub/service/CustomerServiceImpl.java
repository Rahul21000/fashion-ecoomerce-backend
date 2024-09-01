package com.travelltrip.transporthub.service;

import com.travelltrip.transporthub.exception.CustomNotFoundException;
import com.travelltrip.transporthub.model.Customer;
import com.travelltrip.transporthub.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepository repository;

    @Override
    public Customer registerCustomerService(Customer customer) {
       return repository.save(customer);
    }

    @Override
    public void LoginCustomerService(Long customerId) {

    }

    @Override
    public Customer findCustomerService(Long customerId) throws CustomNotFoundException {
        Optional<Customer> customer=repository.findById(customerId);
        if (customer.isEmpty()){
        throw new CustomNotFoundException("customer not present");
        }
        return customer.get();
    }

    @Override
    public List<Customer> findAllProductService() {
        return List.of();
    }

    @Override
    public void updateCustomerService(Long customerId, Customer customer) {

    }


}
