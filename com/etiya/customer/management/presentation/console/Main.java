package com.etiya.customer.management.presentation.console;

import com.etiya.customer.management.core.ccc.logging.ConsoleLogger;
import com.etiya.customer.management.entities.concretes.Customer;
import com.etiya.customer.management.entities.concretes.Order;
import com.etiya.customer.management.repositories.abstracts.ICustomerRepository;
import com.etiya.customer.management.repositories.concretes.InMemoryCustomerRepository;
import com.etiya.customer.management.repositories.concretes.inMemoryOrderRepository;
import com.etiya.customer.management.services.abstracts.ICustomerService;
import com.etiya.customer.management.services.abstracts.IOrderService;
import com.etiya.customer.management.services.adapters.MernisAdapter;
import com.etiya.customer.management.services.concretes.CustomerCheckService;
import com.etiya.customer.management.services.concretes.CustomerService;
import com.etiya.customer.management.services.concretes.OrderService;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // IoC Yönetimi
        ICustomerService customerService = new CustomerService(
                new InMemoryCustomerRepository(),
                new ConsoleLogger(),
                new CustomerCheckService());
        Customer customer = new Customer(1,"Halit","Kalaycı","CU500","12345678901","halit@kodlama.io","123");
        customerService.add(customer);

        Customer customer1 = new Customer(2,"Caner","Börekçi","CU510","12345678902","caner@etiya.com","123");
        customerService.add(customer1);
        /*Customer customer1 = new Customer(2,"Caner","Börekçi","CU510","1","caner@etiya.com","123");
        customerService.add(customer1);*/

        Customer customerWithId = customerService.getById(2);
        System.out.println(customerWithId.getName());

        IOrderService orderService = new OrderService(
                new inMemoryOrderRepository(),
                new ConsoleLogger(),
                new CustomerService(
                        new InMemoryCustomerRepository(),
                        new ConsoleLogger(),
                        new CustomerCheckService())
        );


        Order order1 = new Order(1,"1",customer, "2023.02.02" ,true);
        orderService.add(order1);
        System.out.println(order1.getCustomer().getId());

        Order order2 = new Order(2,"2",customer,"2022",false);
        orderService.add(order2);

    }
}
