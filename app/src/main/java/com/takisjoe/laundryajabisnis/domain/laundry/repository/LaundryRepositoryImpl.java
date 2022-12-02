package com.takisjoe.laundryajabisnis.domain.laundry.repository;

import com.takisjoe.laundryajabisnis.domain.laundry.entity.Laundry;

public class LaundryRepositoryImpl implements LaundryRepository{
    private Laundry laundry;

    public LaundryRepositoryImpl() {
        laundry = new Laundry();
    }

    @Override
    public Laundry getAll() {
        return laundry;
    }

    @Override
    public void setAll(Laundry laundry) {
        setIdLaundry(laundry.getIdLaundry());
    }

    @Override
    public void setIdLaundry(String idLaundry) {
        String result = idLaundry;
        laundry.setIdLaundry(result);
    }

    @Override
    public void setIdCustomerLaundry(String idCustomerLaundry) {
        String result = idCustomerLaundry;
        laundry.setIdCustomerLaundry(result);
    }

    @Override
    public void setIdCompanyLaundry(String idCompanyLaundry) {
        String result = idCompanyLaundry;
        laundry.setIdCompanyLaundry(result);
    }

    @Override
    public void setIdBranchLaundry(String idBranchLaundry) {
        String result = idBranchLaundry;
        laundry.setIdBranchLaundry(result);
    }

    @Override
    public void setIdEmployeeLaundry(String idEmployeeLaundry) {
        String result = idEmployeeLaundry;
        laundry.setIdEmployeeLaundry(result);
    }

    @Override
    public void setDetailLaundry(String detailLaundry) {
        String result = detailLaundry;
        laundry.setDetailLaundry(result);
    }

    @Override
    public void setPickUpLaundry(Long pickUpLaundry) {
        Long result = pickUpLaundry;
        laundry.setPickUpLaundry(result);
    }

    @Override
    public void setFinishLaundry(Long finishLaundry) {
        Long result = finishLaundry;
        laundry.setFinishLaundry(result);
    }

    @Override
    public void setStatusLaundry(Boolean statusLaundry) {
        Boolean result = statusLaundry;
        laundry.setStatusLaundry(result);
    }

    @Override
    public void setCreateTicketLaundry(Long createTicketLaundry) {
        Long result = createTicketLaundry;
    }
}
