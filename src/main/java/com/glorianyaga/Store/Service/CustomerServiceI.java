package com.glorianyaga.Store.Service;

import com.glorianyaga.Store.Modules.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerServiceI {

     Customer createCustomer(Customer customer);
     List<Customer> getAllCustomers();
     Customer updateCustomer(Long customerNumber, Customer customer);
     void deleteCustomer(Long customerNumber);

}
