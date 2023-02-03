package com.etiya.customer.management.services.abstracts;

import com.etiya.customer.management.entities.concretes.Customer;
import com.etiya.customer.management.entities.concretes.Order;

import java.util.List;

public interface IOrderService {
    List<Order> getAll();
    Order getById(int id);
    void add(Order order) throws Exception;
    void update(Order order) throws Exception;
    void delete(Order order) throws Exception;
}
