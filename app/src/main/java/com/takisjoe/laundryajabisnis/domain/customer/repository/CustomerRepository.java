package com.takisjoe.laundryajabisnis.domain.customer.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.takisjoe.laundryajabisnis.domain.customer.entity.Customer;

import java.util.List;

public interface CustomerRepository {

    /**
     *
     * @return seluruh data customer
     */
    Customer getAll();

    /**
     *
     * @param customer harus berisikan data yang sudah dibuat
     */
    void setAll(Customer customer);

    /**
     *
     * @param idCustomer pembuatan id 
     */
    void setId(String idCustomer);

    void setUID(String uid);

    void setNama(String nama);

    void setEmail(String email);

    void setAddress(String address);

    void setGender(int gender);

    void setWhatsapp(String whatsapp);

    void setWhatsappRegistered(boolean registered);

    void setPhone(String phone);

    void setPhoneRegistered(boolean registered);

    void setScore(int score);

    void setUrlProfile(String urlProfile);

    void setLastSeen(Long lastSeen);

    void setLastSeen();

    void setTimestampCreatingAccount(Long timestampCreatingAccount);

    void setTimestampCreatingAccount();

    void insertRoom(Application application, Customer customer);

    void updateRoom(Application application, Customer customer);

    void deleteRoom(Application application, Customer customer);

    void deleteAllRoom(Application application);

    LiveData<List<Customer>> getAllCustomerRoom(Application application);

    LiveData<List<Customer>> searchRoom(Application application,String whatsapp);
}
