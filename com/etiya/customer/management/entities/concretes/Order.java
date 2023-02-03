package com.etiya.customer.management.entities.concretes;

import com.etiya.customer.management.entities.abstracts.IEntity;

import java.util.Date;

// Lombok
public class Order implements IEntity {
    int id;
    String orderNumber;
    Customer customer;
    String orderDate;
    boolean isActive;

    public Order() {
    }

    public Order(int id, String orderNumber, Customer customer, String orderDate, boolean isActive) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.orderDate = orderDate;
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
