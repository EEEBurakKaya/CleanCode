package com.etiya.customer.management.repositories.abstracts;

import com.etiya.customer.management.entities.concretes.Order;

import java.util.List;

public interface IOrderRepository {
    List<Order> getAll();
    Order getById(int id);
    void add(Order order);
    void delete(Order order);
    void update(Order order);
}
