package com.takisjoe.laundryajabisnis.domain.customer.repository;

import androidx.annotation.NonNull;

import com.takisjoe.laundryajabisnis.domain.customer.entity.Customer;
import com.takisjoe.laundryajabisnis.util.debug.TagRepository;
import com.takisjoe.laundryajabisnis.util.timestamp.TimestampUtil;

public class CustomerImplRepository implements CustomerRepository {
    private final Customer customer;

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
        if (idCustomer != null && !idCustomer.equals("")) {
            result = idCustomer;
        } else {
            result = "Buat setting id disini {tahun(2),bulan(2),tanggal(2),Token(4),idLaundry()}";
        }
        //Generate id custom
        customer.setIdCustomer(result);
    }

    @Override
    public void setUID(String uid) {
        String result = "";
        customer.setUidCustomer(result);
    }

    @Override
    public void setNama(String nama) {
        String result = "";
        customer.setNameCustomer(result);
    }

    @Override
    public void setEmail(String email) {
        String result = "";
        customer.setEmailCustomer(result);
    }

    @Override
    public void setAddress(String address) {
        String result = "";
        customer.setAddressCustomer(result);
    }

    @Override
    public void setGender(int gender) {
        int result = 0;
        customer.setGenderCustomer(result);
    }

    @Override
    public void setWhatsapp(String whatsapp) {
        String result = "";
        customer.setWhatsappCustomer(result);
    }

    @Override
    public void setWhatsappRegistered(boolean registered) {
        boolean result = false;
        if (registered) result = true;
        customer.setWhatsappRegisteredCustomer(result);
    }

    @Override
    public void setPhone(String phone) {
        String result = "";
        customer.setPhoneCustomer(result);
    }

    @Override
    public void setPhoneRegistered(boolean registered) {
        boolean result = false;
        customer.setPhoneRegisteredCustomer(result);
    }

    @Override
    public void setScore(int score) {
        int result = 0;
        customer.setScoreCustomer(result);
    }

    @Override
    public void setUrlProfile(String urlProfile) {
        String result = "";
        customer.setUrlProfile(result);
    }

    @Override
    public void setLastSeen(Long lastSeen) {
        Long result;
        if (lastSeen > 0) {
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
        if (timestampCreatingAccount > 0L) {
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
}
