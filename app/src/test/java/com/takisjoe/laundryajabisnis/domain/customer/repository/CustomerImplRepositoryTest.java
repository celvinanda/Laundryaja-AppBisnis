package com.takisjoe.laundryajabisnis.domain.customer.repository;

import com.takisjoe.laundryajabisnis.util.debug.TagRepository;

import junit.framework.TestCase;

public class CustomerImplRepositoryTest extends TestCase {
    private CustomerImplRepository customerImplRepository ;

    public void testGenerateId() {
        CustomerRepository repository = new CustomerImplRepository();
        repository.setId("");

        TagRepository.testing(repository.getAll().getIdCustomer());

    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        customerImplRepository = new CustomerImplRepository();
    }

    public void testCreateId() {
        customerImplRepository.setId(null);
    }

    public void testSetId() {
        customerImplRepository.setId("CELVINANDA");
    }

    public void testName() {

        customerImplRepository.setNama("Celvinanda Octiawan");
    }

    public void testGender() {
        customerImplRepository.setGender(1);
    }

    public void testEmail() {

        customerImplRepository.setEmail("celvin@email.com");
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        System.out.println("Id     : "+customerImplRepository.getAll().getIdCustomer());
        System.out.println("Name   : "+customerImplRepository.getAll().getNameCustomer());
        System.out.println("Gender : "+customerImplRepository.getAll().getGenderCustomer());
    }
}