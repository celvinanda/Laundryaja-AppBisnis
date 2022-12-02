package com.takisjoe.laundryajabisnis.domain.company.center.repository;


import com.takisjoe.laundryajabisnis.domain.company.center.entity.CompanyCenter;

public class CompanyCenterRepositoryImpl implements CompanyCenterRepository{

    private CompanyCenter companyCenter;

    public CompanyCenterRepositoryImpl() {
        companyCenter = new CompanyCenter();
    }

    @Override
    public CompanyCenter getAll() {
        return companyCenter;
    }

    @Override
    public void setAll(CompanyCenter companyCenter) {
        setIdCompanyCenter(companyCenter.getIdCompanyCenter());
        setIdOwnerCompanyCenter(companyCenter.getIdOwnerCompanyCenter());
        setNameCompanyCenter(companyCenter.getNameCompanyCenter());
        setAddressCompanyCenter(companyCenter.getAddressCompanyCenter());
        setScoreCompanyCenter(companyCenter.getScoreCompanyCenter());
        setStatusCompanyCenter(companyCenter.getStatusCompanyCenter());
        setCreateCompanyCenter(companyCenter.getCreateCompanyCenter());
        setSeenLastCompanyCenter(companyCenter.getSeenLastCompanyCenter());
    }

    @Override
    public void setIdCompanyCenter(String idCompanyCenter) {
        String result = "";
        if (idCompanyCenter == null) {

        }else {
            result = idCompanyCenter;
        }
        companyCenter.setIdCompanyCenter(result);

    }

    @Override
    public void setIdOwnerCompanyCenter(String idOwnerCompanyCenter) {
        String result = "";
        companyCenter.setIdOwnerCompanyCenter(result);
    }

    @Override
    public void setNameCompanyCenter(String nameCompanyCenter) {
        String result = "";

    }

    @Override
    public void setAddressCompanyCenter(String addressCompanyCenter) {
        String result = "";
    }

    @Override
    public void setScoreCompanyCenter(String scoreCompanyCenter) {
        String result = "";
    }

    @Override
    public void setStatusCompanyCenter(String statusCompanyCenter) {
        String result = "";
    }

    @Override
    public void setCreateCompanyCenter(Long createCompanyCenter) {
        Long result = 0L;
    }

    @Override
    public void setSeenLastCompanyCenter(Long seenLastCompanyCenter) {
        Long result = 0L;
    }


}
