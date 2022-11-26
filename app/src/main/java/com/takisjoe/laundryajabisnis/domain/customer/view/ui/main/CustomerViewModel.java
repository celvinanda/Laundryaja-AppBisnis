package com.takisjoe.laundryajabisnis.domain.customer.view.ui.main;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.takisjoe.laundryajabisnis.domain.customer.entity.Customer;
import com.takisjoe.laundryajabisnis.domain.customer.service.CustomerImplService;
import com.takisjoe.laundryajabisnis.domain.customer.service.CustomerService;
import com.takisjoe.laundryajabisnis.util.timestamp.TimestampUtil;

import java.util.List;

public class CustomerViewModel extends AndroidViewModel {
    private final Application application;
    private final CustomerService customerService = new CustomerImplService();


    public CustomerViewModel(@NonNull Application app) {
        super(app);
        application = app;
    }

    // TODO: Implement the ViewModel

    public void addCustomer() {
        customerService.setCustomer(Customer.fakeCustomer());
        customerService.insertRoom(application);
    }

    public LiveData<List<Customer>> getAllCustomer() {
       return customerService.getAllUser(application);
    }
}