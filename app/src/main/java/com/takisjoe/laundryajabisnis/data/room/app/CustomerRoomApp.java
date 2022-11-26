package com.takisjoe.laundryajabisnis.data.room.app;

import android.app.Application;
import android.os.AsyncTask;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;

import com.takisjoe.laundryajabisnis.data.room.dao.CustomerDao;
import com.takisjoe.laundryajabisnis.data.room.database.CustomerDatabase;
import com.takisjoe.laundryajabisnis.domain.customer.entity.Customer;
import com.takisjoe.laundryajabisnis.util.debug.TagUtil;

import java.util.List;
import java.util.Objects;

public class CustomerRoomApp {
    private final CustomerDao customerDao;
    private Application context;

    public CustomerRoomApp(Application application) {
        CustomerDatabase customerDatabase = CustomerDatabase.getInstance(application);
        customerDao = customerDatabase.customerDao();
        context = application;
    }

    /**
     * @param customer digunakan untuk menambahkan data kedalam room customerDatabase
     */
    public void insert(Customer customer) {
        new InsertCustomerAsyncTask(customerDao).execute(customer);
    }

    /**
     * @param customer digunakan untuk mengubah data yang sudah ada didalam room
     */
    public void update(Customer customer) {
        new UpdateCustomerAsyncTask(customerDao).execute(customer);
    }

    /**
     * @param customer digunakan untuk menghapus 1 data customer sesuai parameter yang dimasukan
     */
    public void delete(Customer customer) {
        new DeleteCustomerAsyncTask(customerDao).execute(customer);
    }

    /**
     * @see "clear()" digunakan untuk menghapus semua data yang ada didalam customerDatabase
     */
    public void clear() {
        new DelateAllCustomerAsyncTask(customerDao).execute();
    }

    /**
     *
     * @return allCustomer akan mengembalikan seluruh data yang terdaftar didalam customerDatabase
     */
    public LiveData<List<Customer>> readAll() {
        return customerDao.getAllCustomer();
    }

    /**
     *
     * @param whatsapp digunakan untuk memberikan input value yang akan dicari
     * @return seluruh data customer yang difilter dengan @param whatsapp
     */
    public LiveData<List<Customer>> searchWhatsapp(String whatsapp) {
        return customerDao.searchCustomer(whatsapp + "%");
    }

    /*----------------------------------------AsynTask-------------------------------------------------*/

    private static class InsertCustomerAsyncTask extends AsyncTask<Customer, Void, Void> {
        private final CustomerDao customerDao;

        private InsertCustomerAsyncTask(CustomerDao customerDao) {
            this.customerDao = customerDao;
        }

        @Nullable
        @Override
        protected Void doInBackground(@NonNull Customer... customers) {
            TagUtil.i("CustomerRoomApp", "Menambahkan customer");
            customerDao.insert(customers[0]);
            return null;
        }
    }

    private static class UpdateCustomerAsyncTask extends AsyncTask<Customer, Void, Void> {
        private final CustomerDao customerDao;

        private UpdateCustomerAsyncTask(CustomerDao customerDao) {
            this.customerDao = customerDao;
        }

        @Nullable
        @Override
        protected Void doInBackground(@NonNull Customer... customers) {
            customerDao.update(customers[0]);
            return null;
        }
    }

    private static class DeleteCustomerAsyncTask extends AsyncTask<Customer, Void, Void> {
        private final CustomerDao customerDao;

        private DeleteCustomerAsyncTask(CustomerDao customerDao) {
            this.customerDao = customerDao;
        }

        @Nullable
        @Override
        protected Void doInBackground(@NonNull Customer... customers) {
            customerDao.delete(customers[0]);
            return null;
        }
    }

    private static class DelateAllCustomerAsyncTask extends AsyncTask<Customer, Void, Void> {
        private final CustomerDao customerDao;

        private DelateAllCustomerAsyncTask(CustomerDao customerDao) {
            this.customerDao = customerDao;
        }

        @Nullable
        @Override
        protected Void doInBackground(Customer... customers) {
            customerDao.deleteAllCustomer();
            return null;
        }
    }

}
