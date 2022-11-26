package com.takisjoe.laundryajabisnis.domain.customer.view.ui.add;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

import com.takisjoe.laundryajabisnis.domain.customer.entity.Customer;
import com.takisjoe.laundryajabisnis.domain.customer.service.CustomerImplService;
import com.takisjoe.laundryajabisnis.domain.customer.service.CustomerService;

public class AddCustomerViewModel extends AndroidViewModel {
    CustomerService customerService = new CustomerImplService();

    private Application application;

    public AddCustomerViewModel(@NonNull Application app) {
        super(app);
        application = app;
    }

    public void setCustomer(Customer customer) {
        customerService.setCustomer(customer);
    }

    public String insertCustomer() {
        customerService.insertRoom(application);
        return null;
    }
}