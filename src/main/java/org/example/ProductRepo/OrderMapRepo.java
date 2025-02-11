package org.example.ProductRepo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderMapRepo implements OrderRepo {
    private final Map<Integer, Order> ordersMap;

    public OrderMapRepo() {
        this.ordersMap = new HashMap<>();
    }

    @Override
    public void addOrder(Order order) {
        ordersMap.put(order.id(), order);
        System.out.println("Order with ID " + order.id() + " added.");
    }

    @Override
    public void removeOrder(int orderId) {
        if (ordersMap.containsKey(orderId)) {
            ordersMap.remove(orderId);
            System.out.println("Order with ID " + orderId + " removed.");
        } else {
            System.out.println("Order with ID " + orderId + " does not exist.");
        }
    }

    @Override
    public Order getOrderById(int orderId) {
        return ordersMap.get(orderId);
    }

    @Override
    public List<Order> getAllOrders() {
        return List.copyOf(ordersMap.values());
    }

    @Override
    public void printAllOrders() {
        if (ordersMap.isEmpty()) {
            System.out.println("No orders available.");
        } else {
            System.out.println("All Orders:");
            for (Order order : ordersMap.values()) {
                System.out.println(order);
            }
        }
    }
}
