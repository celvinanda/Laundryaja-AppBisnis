package com.takisjoe.laundryajabisnis.domain.customer.service;

import com.takisjoe.laundryajabisnis.domain.customer.entity.Customer;

public interface CustomerService {

    /**
     *
     * @return semua data customer yang telah diinput
     */
    Customer getCustomer();

    /**
     *
     * @param customer digunakan untuk men-set data customer
     */
    void setCustomer(Customer customer);

    void insertRoom(Customer customer);
}
