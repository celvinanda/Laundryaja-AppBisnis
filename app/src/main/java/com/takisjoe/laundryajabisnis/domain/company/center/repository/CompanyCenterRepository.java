package com.takisjoe.laundryajabisnis.domain.company.center.repository;

import com.takisjoe.laundryajabisnis.domain.company.center.entity.CompanyCenter;

public interface CompanyCenterRepository {

    CompanyCenter getAll();

    void setAll(CompanyCenter companyCenter);

    void setIdCompanyCenter(String idCompanyCenter);

    void setIdOwnerCompanyCenter(String idOwnerCompanyCenter);

    void setNameCompanyCenter(String nameCompanyCenter);

    void setAddressCompanyCenter(String addressCompanyCenter);

    void setScoreCompanyCenter(String scoreCompanyCenter);

    void setStatusCompanyCenter(String statusCompanyCenter);

    void setCreateCompanyCenter(Long createCompanyCenter);

    void setSeenLastCompanyCenter(Long seenLastCompanyCenter);

}
