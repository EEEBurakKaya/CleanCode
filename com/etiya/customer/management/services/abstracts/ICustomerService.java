package com.etiya.customer.management.services.abstracts;

import com.etiya.customer.management.entities.concretes.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAll();
    Customer getById(int id);
    void add(Customer customer) throws Exception;
    void update(Customer customer) throws Exception;
    void delete(Customer customer) throws Exception;
    void checkCustomerWithId (int id) throws Exception;
}
