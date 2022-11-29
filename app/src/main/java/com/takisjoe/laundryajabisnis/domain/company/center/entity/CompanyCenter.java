package com.takisjoe.laundryajabisnis.domain.company.center.entity;

public class CompanyCenter {
    private String idCompanyCenter = "CCAA001";
    private String idOwnerCompanyCenter;
    private String nameCompanyCenter;
    private String addressCompanyCenter;
    private String scoreCompanyCenter;
    private String statusCompanyCenter;
    private Long createCompanyCenter;
    private Long seenLastCompanyCenter;

    public CompanyCenter() {
    }

    public CompanyCenter(String idCompanyCenter, String idOwnerCompanyCenter, String nameCompanyCenter, String addressCompanyCenter, String scoreCompanyCenter, String statusCompanyCenter, Long createCompanyCenter, Long seenLastCompanyCenter) {
        this.idCompanyCenter = idCompanyCenter;
        this.idOwnerCompanyCenter = idOwnerCompanyCenter;
        this.nameCompanyCenter = nameCompanyCenter;
        this.addressCompanyCenter = addressCompanyCenter;
        this.scoreCompanyCenter = scoreCompanyCenter;
        this.statusCompanyCenter = statusCompanyCenter;
        this.createCompanyCenter = createCompanyCenter;
        this.seenLastCompanyCenter = seenLastCompanyCenter;
    }

    public String getIdCompanyCenter() {
        return idCompanyCenter;
    }

    public void setIdCompanyCenter(String idCompanyCenter) {
        this.idCompanyCenter = idCompanyCenter;
    }

    public String getIdOwnerCompanyCenter() {
        return idOwnerCompanyCenter;
    }

    public void setIdOwnerCompanyCenter(String idOwnerCompanyCenter) {
        this.idOwnerCompanyCenter = idOwnerCompanyCenter;
    }

    public String getNameCompanyCenter() {
        return nameCompanyCenter;
    }

    public void setNameCompanyCenter(String nameCompanyCenter) {
        this.nameCompanyCenter = nameCompanyCenter;
    }

    public String getAddressCompanyCenter() {
        return addressCompanyCenter;
    }

    public void setAddressCompanyCenter(String addressCompanyCenter) {
        this.addressCompanyCenter = addressCompanyCenter;
    }

    public String getScoreCompanyCenter() {
        return scoreCompanyCenter;
    }

    public void setScoreCompanyCenter(String scoreCompanyCenter) {
        this.scoreCompanyCenter = scoreCompanyCenter;
    }

    public String getStatusCompanyCenter() {
        return statusCompanyCenter;
    }

    public void setStatusCompanyCenter(String statusCompanyCenter) {
        this.statusCompanyCenter = statusCompanyCenter;
    }

    public Long getCreateCompanyCenter() {
        return createCompanyCenter;
    }

    public void setCreateCompanyCenter(Long createCompanyCenter) {
        this.createCompanyCenter = createCompanyCenter;
    }

    public Long getSeenLastCompanyCenter() {
        return seenLastCompanyCenter;
    }

    public void setSeenLastCompanyCenter(Long seenLastCompanyCenter) {
        this.seenLastCompanyCenter = seenLastCompanyCenter;
    }
}

