package com.takisjoe.laundryajabisnis.domain.customer.service;

import android.app.Application;
import android.widget.Toast;

import androidx.lifecycle.LiveData;

import com.takisjoe.laundryajabisnis.domain.customer.entity.Customer;
import com.takisjoe.laundryajabisnis.domain.customer.repository.CustomerImplRepository;
import com.takisjoe.laundryajabisnis.domain.customer.repository.CustomerRepository;

import java.util.List;

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
    public void insertRoom(Application application) {
        customerRepository.insertRoom(application, getCustomer());
    }

    @Override
    public LiveData<List<Customer>> getAllUser(Application application) {
        return customerRepository.getAllCustomerRoom(application);
    }

}
