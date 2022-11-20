package com.takisjoe.laundryajabisnis.domain.customer.service;

import com.takisjoe.laundryajabisnis.domain.customer.entity.Customer;
import com.takisjoe.laundryajabisnis.domain.customer.repository.CustomerImplRepository;
import com.takisjoe.laundryajabisnis.domain.customer.repository.CustomerRepository;

public class CustomerImplService implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerImplService() {
        customerRepository = new CustomerImplRepository();
    }

    @Override
    public Customer getCustomer() {
        return customerRepository.getAll();
    }

    @Override
    public void setCustomer(Customer customer) {
        customerRepository.setAll(customer);
    }

    @Override
    public void insertRoom(Customer customer) {
        Customer result = customer;

        customerRepository.setAll(result);
    }


}
