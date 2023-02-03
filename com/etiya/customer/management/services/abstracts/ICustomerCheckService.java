package com.etiya.customer.management.services.abstracts;

public interface ICustomerCheckService {
    boolean validateNationalityIdentity(String name, String lastName, String nationalityId);
}
