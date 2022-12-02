package com.takisjoe.laundryajabisnis.domain.customer.entity;

public class CustomerBuilder {
    //TODO : Default Value
    private String idCustomer = null;
    private String uidCustomer = null;
    private String nameCustomer = null;
    private String emailCustomer = null;
    private String addressCustomer = null;
    private int genderCustomer = -1;
    private String whatsappCustomer = null;
    private Boolean whatsappRegisteredCustomer = false;
    private String phoneCustomer = null;
    private Boolean phoneRegisteredCustomer = false;
    private String urlProfile = null;
    private int scoreCustomer = -1;
    private Long lastSeenCustomer = -1L;
    private Long createdCustomer = -1L;


    public Customer build() {
        return new Customer(
                this.idCustomer,
                this.uidCustomer,
                this.nameCustomer,
                this.emailCustomer,
                this.addressCustomer,
                this.genderCustomer,
                this.whatsappCustomer,
                this.whatsappRegisteredCustomer,
                this.phoneCustomer,
                this.phoneRegisteredCustomer,
                this.urlProfile,
                this.scoreCustomer,
                this.lastSeenCustomer,
                this.createdCustomer
        );
    }

    public CustomerBuilder setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
        return this;
    }

    public CustomerBuilder setUidCustomer(String uidCustomer) {
        this.uidCustomer = uidCustomer;
        return this;
    }

    public CustomerBuilder setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
        return this;
    }

    public CustomerBuilder setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
        return this;
    }

    public CustomerBuilder setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
        return this;
    }

    public CustomerBuilder setGenderCustomer(int genderCustomer) {
        this.genderCustomer = genderCustomer;
        return this;
    }

    public CustomerBuilder setWhatsappCustomer(String whatsappCustomer) {
        this.whatsappCustomer = whatsappCustomer;
        return this;
    }

    public CustomerBuilder setWhatsappRegisteredCustomer(Boolean whatsappRegisteredCustomer) {
        this.whatsappRegisteredCustomer = whatsappRegisteredCustomer;
        return this;
    }

    public CustomerBuilder setPhoneCustomer(String phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
        return this;
    }

    public CustomerBuilder setPhoneRegisteredCustomer(Boolean phoneRegisteredCustomer) {
        this.phoneRegisteredCustomer = phoneRegisteredCustomer;
        return this;
    }

    public CustomerBuilder setUrlProfile(String urlProfile) {
        this.urlProfile = urlProfile;
        return this;
    }

    public CustomerBuilder setScoreCustomer(int scoreCustomer) {
        this.scoreCustomer = scoreCustomer;
        return this;
    }

    public CustomerBuilder setLastSeenCustomer(Long lastSeenCustomer) {
        this.lastSeenCustomer = lastSeenCustomer;
        return this;
    }

    public CustomerBuilder setCreatedCustomer(Long createdCustomer) {
        this.createdCustomer = createdCustomer;
        return this;
    }
}
