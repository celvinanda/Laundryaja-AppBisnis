package com.takisjoe.laundryajabisnis.domain.customer.service;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.takisjoe.laundryajabisnis.domain.customer.entity.Customer;

import java.util.List;

public interface CustomerService {

    /**
     * @return semua data customer yang telah diinput
     */
    Customer getCustomer();

    /**
     * @param customer digunakan untuk men-set data customer
     */
    void setCustomer(Customer customer);

    void insertRoom(Application application);

    LiveData<List<Customer>> getAllUser(Application application);

}
