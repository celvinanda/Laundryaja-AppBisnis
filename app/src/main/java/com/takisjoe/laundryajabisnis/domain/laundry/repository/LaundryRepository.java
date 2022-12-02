package com.takisjoe.laundryajabisnis.domain.laundry.repository;

import com.takisjoe.laundryajabisnis.domain.laundry.entity.Laundry;

public interface LaundryRepository {
    Laundry getAll();

    void setAll(Laundry laundry);

    void setIdLaundry(String IdLaundry);

    void setIdCustomerLaundry(String IdCustomerLaundry);

    void setIdCompanyLaundry(String IdCompanyLaundry);

    void setIdBranchLaundry(String IdBranchLaundry);

    void setIdEmployeeLaundry(String IdEmployeeLaundry);

    void setDetailLaundry(String DetailLaundry);

    void setPickUpLaundry(Long PickUpLaundry);

    void setFinishLaundry(Long FinishLaundry);

    void setStatusLaundry(Boolean StatusLaundry);

    void setCreateTicketLaundry(Long CreateTicketLaundry);
}
