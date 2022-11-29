package com.takisjoe.laundryajabisnis.domain.customer.repository;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;

import com.takisjoe.laundryajabisnis.data.room.app.CustomerRoomApp;
import com.takisjoe.laundryajabisnis.domain.company.center.entity.CompanyCenter;
import com.takisjoe.laundryajabisnis.domain.customer.entity.Customer;
import com.takisjoe.laundryajabisnis.domain.customer.entity.CustomerBuilder;
import com.takisjoe.laundryajabisnis.util.debug.TagRepository;
import com.takisjoe.laundryajabisnis.util.timestamp.TimestampUtil;

import java.util.List;

public class CustomerImplRepository implements CustomerRepository {
    private final Customer customer;
    private CustomerRoomApp customerRoomApp;

    public CustomerImplRepository() {
        customer = new Customer();
    }

    @Override
    public Customer getAll() {
        return customer;
    }

    @Override
    public void setAll(@NonNull Customer customer) {
        setId(customer.getIdCustomer());
        setUID(customer.getUidCustomer());
        setNama(customer.getNameCustomer());
        setEmail(customer.getEmailCustomer());
        setAddress(customer.getAddressCustomer());
        setGender(customer.getGenderCustomer());
        setWhatsapp(customer.getWhatsappCustomer());
        setWhatsappRegistered(customer.getWhatsappRegisteredCustomer());
        setPhone(customer.getPhoneCustomer());
        setPhoneRegistered(customer.getPhoneRegisteredCustomer());
        setScore(customer.getScoreCustomer());
        setUrlProfile(customer.getUidCustomer());
        setLastSeen(customer.getLastSeenCustomer());
        setTimestampCreatingAccount(customer.getCreatedCustomer());
    }

    @Override
    public void setId(String idCustomer) {
        String result = "";
        if (idCustomer != null) {
            result = idCustomer;
            TagRepository.succes("Mendapatkan ID : "+result);
        } else {
//            result = "Buat setting id disini {tahun(2),bulan(2),tanggal(2),Token(4),idLaundry()}";
            result = new CompanyCenter().getIdCompanyCenter() +TimestampUtil.getNewTimestamp();
            TagRepository.succes("Membuat ID baru : "+result);
        }
        //Generate id custom
        customer.setIdCustomer(result);
    }

    @Override
    public void setUID(String uid) {
        String result = "";
        result = uid;
        customer.setUidCustomer(result);
    }

    @Override
    public void setNama(String nama) {
        String result = "";
        result = nama;
        customer.setNameCustomer(result);
    }

    @Override
    public void setEmail(String email) {
        String result = "";
        result = email;
        customer.setEmailCustomer(result);
    }

    @Override
    public void setAddress(String address) {
        String result = "";
        result = address;
        customer.setAddressCustomer(result);
    }

    @Override
    public void setGender(int gender) {
        int result = 0;
        result = gender;
        customer.setGenderCustomer(result);
    }

    @Override
    public void setWhatsapp(String whatsapp) {
        String result = "";
        result = whatsapp;
        customer.setWhatsappCustomer(result);
    }

    @Override
    public void setWhatsappRegistered(boolean registered) {
        boolean result = registered;
        customer.setWhatsappRegisteredCustomer(result);
    }

    @Override
    public void setPhone(String phone) {
        String result = "";
        result = phone;
        customer.setPhoneCustomer(result);
    }

    @Override
    public void setPhoneRegistered(boolean registered) {
        boolean result = registered;
        customer.setPhoneRegisteredCustomer(result);
    }

    @Override
    public void setScore(int score) {
        int result = 0;
        if (score != -1) {
            result = score;
        }
        customer.setScoreCustomer(result);
    }

    @Override
    public void setUrlProfile(String urlProfile) {
        String result = "";
        result = urlProfile;
        customer.setUrlProfile(result);
    }

    @Override
    public void setLastSeen(Long lastSeen) {
        Long result;
        if (lastSeen != -1L) {
            result = lastSeen;
        } else {
            result = TimestampUtil.getNewTimestamp();
        }
        customer.setLastSeenCustomer(result);
    }

    @Override
    public void setLastSeen() {
        Long result;
        result = TimestampUtil.getNewTimestamp();
        customer.setLastSeenCustomer(result);
        TagRepository.succes("Membuat timestamp untuk LastSeen - " + result);
    }

    @Override
    public void setTimestampCreatingAccount(Long timestampCreatingAccount) {
        Long result;
        if (timestampCreatingAccount != -1L) {
            result = timestampCreatingAccount;
            TagRepository.succes("Membuat timestamp untuk akun baru berdasarkan input");
        } else {
            result = TimestampUtil.getNewTimestamp();
            TagRepository.succes("{default} Membuat timestamp untuk akun baru - " + result);

        }
        customer.setCreatedCustomer(result);
    }

    @Override
    public void setTimestampCreatingAccount() {
        Long result;
        result = TimestampUtil.getNewTimestamp();
        customer.setCreatedCustomer(result);
        TagRepository.succes("Membuat timestamp untuk akun baru - " + result);
    }

    @Override
    public void insertRoom(Application application, Customer customer) {
        new CustomerRoomApp(application).insert(customer);
    }

    @Override
    public void updateRoom(Application application, Customer customer) {
        new CustomerRoomApp(application).update(customer);
    }

    @Override
    public void deleteRoom(Application application, Customer customer) {
        new CustomerRoomApp(application).delete(customer);
    }

    @Override
    public void deleteAllRoom(Application application) {
        new CustomerRoomApp(application).clear();
    }

    @Override
    public LiveData<List<Customer>> getAllCustomerRoom(Application application) {
        return new CustomerRoomApp(application).readAll();
    }

    @Override
    public LiveData<List<Customer>> searchRoom(Application application, String whatsapp) {
        return new CustomerRoomApp(application).searchWhatsapp(whatsapp);
    }

}
