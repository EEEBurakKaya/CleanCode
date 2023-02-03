package com.etiya.customer.management.repositories.concretes;

import com.etiya.customer.management.entities.concretes.Customer;
import com.etiya.customer.management.repositories.abstracts.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryCustomerRepository implements ICustomerRepository {
    private List<Customer> customers;

    public InMemoryCustomerRepository() {
        this.customers = new ArrayList<>();
    }

    @Override
    public List<Customer> getAll() {
        return customers;
    }

    @Override
    public Customer getById(int id) {
        return customers.stream().filter(i->i.getId() == id).findFirst().orElseThrow();
    }


    @Override
    public void add(Customer customer) {
        // YANLIŞ!
        //Business Logic
        /*
        if(customers.stream()
                .filter(i->i.getNationalityId()
                        .equals(customer.getNationalityId())) != null){
            return;
        }
        // Validation
        if(customer.getCustomerNo().length() < 3) {
            return;
        } */
        customers.add(customer);
    }

    @Override
    public void delete(Customer customer) {
         customers.remove(customer);
    }

    @Override
    public void update(Customer customer) {
         customers.set(customers.indexOf(customer),customer);
    }


}
