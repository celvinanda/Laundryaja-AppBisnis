package com.takisjoe.laundryajabisnis.domain.customer.repository;

import com.takisjoe.laundryajabisnis.domain.customer.entity.Customer;

public interface CustomerRepository {

    /**
     *
     * @return seluruh data customer
     */
    Customer getAll();

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

    void setUrlProfile();

    void setLastSeen();

    void setTimestampCreatingAccount();
}
