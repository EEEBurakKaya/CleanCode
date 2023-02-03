package com.etiya.customer.management.repositories.concretes;

import com.etiya.customer.management.entities.concretes.Order;
import com.etiya.customer.management.repositories.abstracts.IOrderRepository;

import java.util.ArrayList;
import java.util.List;

public class inMemoryOrderRepository implements IOrderRepository {

   private List<Order> orders;

    public inMemoryOrderRepository() {
        this.orders = new ArrayList<>();
    }

    @Override
    public List<Order> getAll() {
        return orders;
    }

    @Override
    public Order getById(int id) {
        return orders.stream().filter(i->i.getId() == id).findFirst().orElseThrow();
    }

    @Override
    public void add(Order order) {
        orders.add(order);
    }

    @Override
    public void delete(Order order) {
        orders.removeIf(orders -> (orders.getId()) == order.getId());
    }

    @Override
    public void update(Order order) {
        orders.set(orders.indexOf(order),order);
    }
}
