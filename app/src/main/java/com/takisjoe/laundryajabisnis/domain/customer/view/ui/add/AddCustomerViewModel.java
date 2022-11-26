package com.takisjoe.laundryajabisnis.domain.customer.view.ui.add;

import androidx.lifecycle.ViewModel;

import com.takisjoe.laundryajabisnis.domain.customer.service.CustomerImplService;
import com.takisjoe.laundryajabisnis.domain.customer.service.CustomerService;

public class AddCustomerViewModel extends ViewModel {
    CustomerService customerService = new CustomerImplService();
    // TODO: Implement the ViewModel

}