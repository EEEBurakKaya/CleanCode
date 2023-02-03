package com.etiya.customer.management.services.adapters;

import com.etiya.customer.management.services.abstracts.ICustomerCheckService;
import com.etiya.mernis.MernisApplication;

public class MernisAdapter implements ICustomerCheckService {
    @Override
    public boolean validateNationalityIdentity(String name, String lastName, String nationalityId) {
        MernisApplication mernisApplication = new MernisApplication();
        return mernisApplication.validateNationalityId(name,lastName,nationalityId);
    }
}
