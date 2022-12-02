package com.takisjoe.laundryajabisnis.domain.laundry.entity;

public class Laundry {

    private String idLaundry;
    private String idCustomerLaundry;
    private String idCompanyLaundry;
    private String idBranchLaundry;
    private String idEmployeeLaundry;
    private String detailLaundry;
    private Long pickUpLaundry;
    private Long finishLaundry;
    private Boolean statusLaundry;
    private Long createTicketLaundry;

    public Laundry() {
    }

    public Laundry(String idLaundry, String idCustomerLaundry, String idCompanyLaundry, String idBranchLaundry, String idEmployeeLaundry, String detailLaundry, Long pickUpLaundry, Long finishLaundry, Boolean statusLaundry, Long createTicketLaundry) {
        this.idLaundry = idLaundry;
        this.idCustomerLaundry = idCustomerLaundry;
        this.idCompanyLaundry = idCompanyLaundry;
        this.idBranchLaundry = idBranchLaundry;
        this.idEmployeeLaundry = idEmployeeLaundry;
        this.detailLaundry = detailLaundry;
        this.pickUpLaundry = pickUpLaundry;
        this.finishLaundry = finishLaundry;
        this.statusLaundry = statusLaundry;
        this.createTicketLaundry = createTicketLaundry;
    }

    public String getIdLaundry() {
        return idLaundry;
    }

    public void setIdLaundry(String idLaundry) {
        this.idLaundry = idLaundry;
    }

    public String getIdCustomerLaundry() {
        return idCustomerLaundry;
    }

    public void setIdCustomerLaundry(String idCustomerLaundry) {
        this.idCustomerLaundry = idCustomerLaundry;
    }

    public String getIdCompanyLaundry() {
        return idCompanyLaundry;
    }

    public void setIdCompanyLaundry(String idCompanyLaundry) {
        this.idCompanyLaundry = idCompanyLaundry;
    }

    public String getIdBranchLaundry() {
        return idBranchLaundry;
    }

    public void setIdBranchLaundry(String idBranchLaundry) {
        this.idBranchLaundry = idBranchLaundry;
    }

    public String getIdEmployeeLaundry() {
        return idEmployeeLaundry;
    }

    public void setIdEmployeeLaundry(String idEmployeeLaundry) {
        this.idEmployeeLaundry = idEmployeeLaundry;
    }

    public String getDetailLaundry() {
        return detailLaundry;
    }

    public void setDetailLaundry(String detailLaundry) {
        this.detailLaundry = detailLaundry;
    }

    public Long getPickUpLaundry() {
        return pickUpLaundry;
    }

    public void setPickUpLaundry(Long pickUpLaundry) {
        this.pickUpLaundry = pickUpLaundry;
    }

    public Long getFinishLaundry() {
        return finishLaundry;
    }

    public void setFinishLaundry(Long finishLaundry) {
        this.finishLaundry = finishLaundry;
    }

    public Boolean getStatusLaundry() {
        return statusLaundry;
    }

    public void setStatusLaundry(Boolean statusLaundry) {
        this.statusLaundry = statusLaundry;
    }

    public Long getCreateTicketLaundry() {
        return createTicketLaundry;
    }

    public void setCreateTicketLaundry(Long createTicketLaundry) {
        this.createTicketLaundry = createTicketLaundry;
    }
}
