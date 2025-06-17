package com.glorianyaga.Store.Service;

import com.glorianyaga.Store.Modules.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderServiceI {

    Order createOrder(Order order);
    List<Order> getAllOrders();
    Order updateOrder(Long orderNumber, Order order);
    void deleteOrder(Long orderNumber);
}
