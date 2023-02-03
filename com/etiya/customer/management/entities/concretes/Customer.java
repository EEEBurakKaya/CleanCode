package com.etiya.customer.management.entities.concretes;

import com.etiya.customer.management.entities.abstracts.IEntity;

public class Customer implements IEntity {
    int id;
    String name;
    String lastName;
    String customerNo;
    String nationalityId;
    String email;
    String password;

    public Customer(int id, String name, String lastName, String customerNo, String nationalityId, String email, String password) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.customerNo = customerNo;
        this.nationalityId = nationalityId;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
