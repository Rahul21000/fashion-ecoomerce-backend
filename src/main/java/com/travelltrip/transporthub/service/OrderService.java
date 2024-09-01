package com.travelltrip.transporthub.service;

import com.travelltrip.transporthub.model.Order;

import java.util.List;

public interface OrderService {
    Order addOrder(Order order);
    Order getOrder(Long orderId);
    List<Order> getAllOrder();
    Order updateOrder(Long orderId,Order order);
    void deleteOrder(Long orderId);
    void deleteAllOrder();
}
