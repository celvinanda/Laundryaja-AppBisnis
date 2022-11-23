package com.takisjoe.laundryajabisnis.domain.customer.repository;

import com.takisjoe.laundryajabisnis.util.debug.TagRepository;

import junit.framework.TestCase;

public class CustomerImplRepositoryTest extends TestCase {


    public void testGenerateId() {
        CustomerRepository repository = new CustomerImplRepository();
        repository.setId("");

        TagRepository.testing(repository.getAll().getIdCustomer());

    }


}