package com.etiya.customer.management.services.concretes;

import com.etiya.customer.management.services.abstracts.ICustomerCheckService;

public class CustomerCheckService implements ICustomerCheckService {
    @Override
    public boolean validateNationalityIdentity(String name, String lastName, String nationalityId) {
        return true;
    }
}
