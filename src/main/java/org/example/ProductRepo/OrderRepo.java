package org.example.ProductRepo;

import java.util.List;

public interface OrderRepo {
    void addOrder(Order order);

    void removeOrder(int orderId);

    Order getOrderById(int orderId);

    List<Order> getAllOrders();

    void printAllOrders();
}
