package com.takisjoe.laundryajabisnis.domain.laundry.entity;

public class LaundryBuilder {

    private String idLaundry = null;
    private String idCustomerLaundry = null;
    private String idCompanyLaundry = null;
    private String idBranchLaundry = null;
    private String idEmployeeLaundry = null;
    private String detailLaundry = null;
    private Long pickUpLaundry = -1L;
    private Long finishLaundry = -1L;
    private Boolean statusLaundry = false;
    private Long createTicketLaundry = -1L;

    private Laundry build() {
        return new Laundry(
                this.idLaundry,
                this.idCustomerLaundry,
                this.idCompanyLaundry,
                this.idBranchLaundry,
                this.idEmployeeLaundry,
                this.detailLaundry,
                this.pickUpLaundry,
                this.finishLaundry,
                this.statusLaundry,
                this.createTicketLaundry
        );
    }

    public LaundryBuilder setIdLaundry(String idLaundry) {
        this.idLaundry = idLaundry;
        return this;
    }

    public LaundryBuilder setIdCustomerLaundry(String idCustomerLaundry) {
        this.idCustomerLaundry = idCustomerLaundry;
        return this;
    }

    public LaundryBuilder setIdCompanyLaundry(String idCompanyLaundry) {
        this.idCompanyLaundry = idCompanyLaundry;
        return this;
    }

    public LaundryBuilder setIdBranchLaundry(String idBranchLaundry) {
        this.idBranchLaundry = idBranchLaundry;
        return this;
    }

    public LaundryBuilder setIdEmployeeLaundry(String idEmployeeLaundry) {
        this.idEmployeeLaundry = idEmployeeLaundry;
        return this;
    }

    public LaundryBuilder setDetailLaundry(String detailLaundry) {
        this.detailLaundry = detailLaundry;
        return this;
    }

    public LaundryBuilder setPickUpLaundry(Long pickUpLaundry) {
        this.pickUpLaundry = pickUpLaundry;
        return this;
    }

    public LaundryBuilder setFinishLaundry(Long finishLaundry) {
        this.finishLaundry = finishLaundry;
        return this;
    }

    public LaundryBuilder setStatusLaundry(Boolean statusLaundry) {
        this.statusLaundry = statusLaundry;
        return this;
    }

    public LaundryBuilder setCreateTicketLaundry(Long createTicketLaundry) {
        this.createTicketLaundry = createTicketLaundry;
        return this;
    }
}
