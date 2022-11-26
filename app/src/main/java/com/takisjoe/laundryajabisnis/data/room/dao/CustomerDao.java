package com.takisjoe.laundryajabisnis.data.room.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.takisjoe.laundryajabisnis.domain.customer.entity.Customer;

import java.util.List;

@Dao
public interface CustomerDao {
    @Insert
    void insert(Customer customer);

    @Update
    void update(Customer customer);

    @Delete
    void delete(Customer customer);

    @Query("DELETE FROM customer_table")
    void deleteAllCustomer();

    @Query("SELECT * FROM customer_table ORDER BY customerName ASC")
    LiveData<List<Customer>> getAllCustomer();

    @Query("SELECT * FROM customer_table WHERE customerWhatsapp LIKE :whatsapp")
    LiveData<List<Customer>> searchCustomer(String whatsapp);

}
