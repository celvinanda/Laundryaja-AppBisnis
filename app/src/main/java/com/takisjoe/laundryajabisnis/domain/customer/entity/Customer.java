package com.takisjoe.laundryajabisnis.domain.customer.entity;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.takisjoe.laundryajabisnis.util.timestamp.TimestampImplUtil;
import com.takisjoe.laundryajabisnis.util.timestamp.TimestampUtil;

@Entity(tableName = "customer_table")
public class Customer {

    @PrimaryKey
    @NonNull
    private String idCustomer;

    @ColumnInfo(name = "customerUid")
    private String uidCustomer;

    @ColumnInfo(name = "customerName")
    private String nameCustomer;

    @ColumnInfo(name = "customerEmail")
    private String emailCustomer;

    @ColumnInfo(name = "customerAddress")
    private String addressCustomer;

    @ColumnInfo(name = "customerGender")
    private int genderCustomer;

    @ColumnInfo(name = "customerWhatsapp")
    private String whatsappCustomer;

    @ColumnInfo(name = "customerWhatsappRegister")
    private Boolean whatsappRegisteredCustomer;

    @ColumnInfo(name = "customerPhone")
    private String phoneCustomer;

    @ColumnInfo(name = "customerPhoneRegister")
    private Boolean phoneRegisteredCustomer;

    @ColumnInfo(name = "customerUrlProfile")
    private String urlProfile;

    @ColumnInfo(name = "customerScore")
    private int scoreCustomer;

    @ColumnInfo(name = "customerLastSeen")
    private Long lastSeenCustomer;

    @ColumnInfo(name = "customerCreate")
    private Long createdCustomer;

    public Customer() {
    }

    public Customer(String idCustomer, String uidCustomer, String nameCustomer, String emailCustomer, String addressCustomer, int genderCustomer, String whatsappCustomer, Boolean whatsappRegisteredCustomer, String phoneCustomer, Boolean phoneRegisteredCustomer, String urlProfile, int scoreCustomer, Long lastSeenCustomer, Long createdCustomer) {
        this.idCustomer = idCustomer;
        this.uidCustomer = uidCustomer;
        this.nameCustomer = nameCustomer;
        this.emailCustomer = emailCustomer;
        this.addressCustomer = addressCustomer;
        this.genderCustomer = genderCustomer;
        this.whatsappCustomer = whatsappCustomer;
        this.whatsappRegisteredCustomer = whatsappRegisteredCustomer;
        this.phoneCustomer = phoneCustomer;
        this.phoneRegisteredCustomer = phoneRegisteredCustomer;
        this.urlProfile = urlProfile;
        this.scoreCustomer = scoreCustomer;
        this.lastSeenCustomer = lastSeenCustomer;
        this.createdCustomer = createdCustomer;
    }

    @NonNull
    public static Customer fakeCustomer() {
        Customer customer = new Customer();
        customer.setIdCustomer("Id-Fake-"+ TimestampUtil.getNewTimestamp());
        customer.setUidCustomer("Id-Fake-"+ TimestampUtil.getNewTimestamp());
        customer.setNameCustomer("Celvinanda");
        customer.setEmailCustomer("Id-Fake-"+ TimestampUtil.getNewTimestamp());
        customer.setAddressCustomer("Id-Fake-"+ TimestampUtil.getNewTimestamp());
        customer.setGenderCustomer(1);
        customer.setWhatsappCustomer("Id-Fake-"+ TimestampUtil.getNewTimestamp());
        customer.setWhatsappRegisteredCustomer(true);
        customer.setPhoneCustomer("Id-Fake-"+ TimestampUtil.getNewTimestamp());
        customer.setPhoneRegisteredCustomer(true);
        customer.setUrlProfile("Id-Fake-"+ TimestampUtil.getNewTimestamp());
        customer.setScoreCustomer(5);
        customer.setLastSeenCustomer(TimestampUtil.getNewTimestamp());
        customer.setCreatedCustomer(TimestampUtil.getNewTimestamp());
        return customer;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getUidCustomer() {
        return uidCustomer;
    }

    public void setUidCustomer(String uidCustomer) {
        this.uidCustomer = uidCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public int getGenderCustomer() {
        return genderCustomer;
    }

    public void setGenderCustomer(int genderCustomer) {
        this.genderCustomer = genderCustomer;
    }

    public String getWhatsappCustomer() {
        return whatsappCustomer;
    }

    public void setWhatsappCustomer(String whatsappCustomer) {
        this.whatsappCustomer = whatsappCustomer;
    }

    public Boolean getWhatsappRegisteredCustomer() {
        return whatsappRegisteredCustomer;
    }

    public void setWhatsappRegisteredCustomer(Boolean whatsappRegisteredCustomer) {
        this.whatsappRegisteredCustomer = whatsappRegisteredCustomer;
    }

    public String getPhoneCustomer() {
        return phoneCustomer;
    }

    public void setPhoneCustomer(String phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }

    public Boolean getPhoneRegisteredCustomer() {
        return phoneRegisteredCustomer;
    }

    public void setPhoneRegisteredCustomer(Boolean phoneRegisteredCustomer) {
        this.phoneRegisteredCustomer = phoneRegisteredCustomer;
    }

    public String getUrlProfile() {
        return urlProfile;
    }

    public void setUrlProfile(String urlProfile) {
        this.urlProfile = urlProfile;
    }

    public int getScoreCustomer() {
        return scoreCustomer;
    }

    public void setScoreCustomer(int scoreCustomer) {
        this.scoreCustomer = scoreCustomer;
    }

    public Long getLastSeenCustomer() {
        return lastSeenCustomer;
    }

    public void setLastSeenCustomer(Long lastSeenCustomer) {
        this.lastSeenCustomer = lastSeenCustomer;
    }

    public Long getCreatedCustomer() {
        return createdCustomer;
    }

    public void setCreatedCustomer(Long createdCustomer) {
        this.createdCustomer = createdCustomer;
    }
}
