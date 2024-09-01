package com.travelltrip.transporthub.service;

import com.travelltrip.transporthub.model.Customer;
import com.travelltrip.transporthub.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    Customer registerCustomerService(Customer customer);
    void LoginCustomerService(Long customerId);
    Customer findCustomerService(Long customerId) throws Exception;
    List<Customer> findAllProductService();
    void updateCustomerService(Long customerId,Customer customer);
}
