package com.takisjoe.laundryajabisnis.domain.company.center.entity;

public class CompanyCenterBuilder {
    private String idCompanyCenter = "CCAA001";
    private String idOwnerCompanyCenter = null;
    private String nameCompanyCenter = null;
    private String addressCompanyCenter = null;
    private String scoreCompanyCenter = null;
    private String statusCompanyCenter = null;
    private Long createCompanyCenter = -1L;
    private Long seenLastCompanyCenter = -1L;

    public CompanyCenter build() {
        return new CompanyCenter(
                this.idCompanyCenter,
                this.idOwnerCompanyCenter,
                this.nameCompanyCenter,
                this.addressCompanyCenter,
                this.scoreCompanyCenter,
                this.statusCompanyCenter,
                this.createCompanyCenter,
                this.seenLastCompanyCenter
        );
    }

    public CompanyCenterBuilder setIdCompanyCenter(String idCompanyCenter) {
        this.idCompanyCenter = idCompanyCenter;
        return this;
    }

    public CompanyCenterBuilder setIdOwnerCompanyCenter(String idOwnerCompanyCenter) {
        this.idOwnerCompanyCenter = idOwnerCompanyCenter;
        return this;
    }

    public CompanyCenterBuilder setNameCompanyCenter(String nameCompanyCenter) {
        this.nameCompanyCenter = nameCompanyCenter;
        return this;
    }

    public CompanyCenterBuilder setAddressCompanyCenter(String addressCompanyCenter) {
        this.addressCompanyCenter = addressCompanyCenter;
        return this;
    }

    public CompanyCenterBuilder setScoreCompanyCenter(String scoreCompanyCenter) {
        this.scoreCompanyCenter = scoreCompanyCenter;
        return this;
    }

    public CompanyCenterBuilder setStatusCompanyCenter(String statusCompanyCenter) {
        this.statusCompanyCenter = statusCompanyCenter;
        return this;
    }

    public CompanyCenterBuilder setCreateCompanyCenter(Long createCompanyCenter) {
        this.createCompanyCenter = createCompanyCenter;
        return this;
    }

    public CompanyCenterBuilder setSeenLastCompanyCenter(Long seenLastCompanyCenter) {
        this.seenLastCompanyCenter = seenLastCompanyCenter;
        return this;
    }
}
