package com.etiya.customer.management.services.concretes;

import com.etiya.customer.management.core.ccc.logging.ILogger;
import com.etiya.customer.management.entities.concretes.Order;
import com.etiya.customer.management.repositories.abstracts.IOrderRepository;
import com.etiya.customer.management.services.abstracts.ICustomerCheckService;
import com.etiya.customer.management.services.abstracts.ICustomerService;
import com.etiya.customer.management.services.abstracts.IOrderService;

import java.util.List;

public class OrderService implements IOrderService {

    private IOrderRepository orderRepository;
    private ILogger logger;
    private ICustomerService customerService;

    public OrderService(IOrderRepository orderRepository, ILogger logger,
                        ICustomerService customerService) {
        this.orderRepository = orderRepository;
        this.logger = logger;
        this.customerService=customerService;
    }

    @Override
    public List<Order> getAll() {
        return orderRepository.getAll();
    }

    @Override
    public Order getById(int id) {
        return orderRepository.getById(id);
    }

    @Override
    public void add(Order order) throws Exception {
        /*
          -Gönderilen customerin id'si ile  bir customerin varlığı kontrol edilmelidir
          -Gönderilen order için orderNumber boş olmamalıdır.
          -Order eklenirken loglama işlemi gerçekleştirilmelidir.
          -Order eklenirken authorization gerçekleşmelidir.*/
        //checkCustomerIsExist(order.getCustomer().getId());
        checkOrderNumberIsEmpty(order);
        whenAddingOrderDoLog(order);
        authorization(order);
        orderRepository.add(order);

    }

    @Override
    public void update(Order order) throws Exception {
         orderRepository.update(order);
    }

    @Override
    public void delete(Order order) throws Exception {
        orderRepository.delete(order);
    }

    private void checkCustomerIsExist(int id) throws Exception {
     customerService.checkCustomerWithId(id);
    }

    private void checkOrderNumberIsEmpty(Order order) throws Exception {
        if (order.getOrderNumber().isEmpty()){
            throw new Exception("Order numarası boş olamaz! ");
        }
    }

    private void whenAddingOrderDoLog(Order order)throws Exception{
            System.out.println("Order geldi");
            logger.log(order.getId()+" numaralı order");
    }

    private void authorization (Order order) {
        System.out.println("Giriş yapıldı.");
    }
}
