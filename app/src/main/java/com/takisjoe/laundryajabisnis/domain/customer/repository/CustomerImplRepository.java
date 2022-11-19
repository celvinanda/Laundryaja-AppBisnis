package com.takisjoe.laundryajabisnis.domain.customer.repository;

import com.takisjoe.laundryajabisnis.domain.customer.entity.Customer;

public class CustomerImplRepository implements CustomerRepository{
    private Customer customer;

    public CustomerImplRepository() {
        customer = new Customer();
    }

    @Override
    public Customer getAll() {
        return customer;
    }

    @Override
    public void setId(String idCustomer) {

    }

    @Override
    public void setUID(String uid) {

    }

    @Override
    public void setNama(String nama) {

    }

    @Override
    public void setEmail(String email) {

    }

    @Override
    public void setAddress(String address) {

    }

    @Override
    public void setGender(int gender) {

    }

    @Override
    public void setWhatsapp(String whatsapp) {

    }

    @Override
    public void setWhatsappRegistered(boolean registered) {

    }

    @Override
    public void setPhone(String phone) {

    }

    @Override
    public void setPhoneRegistered(boolean registered) {

    }

    @Override
    public void setScore(int score) {

    }

    @Override
    public void setUrlProfile() {

    }

    @Override
    public void setLastSeen() {

    }

    @Override
    public void setTimestampCreatingAccount() {

    }
}
