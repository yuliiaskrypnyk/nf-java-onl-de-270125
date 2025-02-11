package org.example.ProductRepo;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo implements OrderRepo {
    private final List<Order> orders;

    public OrderListRepo() {
        this.orders = new ArrayList<>();
    }

    @Override
    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public void removeOrder(int orderId) {
        //orders.remove(orderId);

        boolean removed = orders.removeIf(order -> order.id() == orderId);
        if (!removed) {
            System.out.println("Order with ID " + orderId + " does not exist.");
        } else {
            System.out.println("Order with ID " + orderId + " was removed.");
        }
    }

    @Override
    public Order getOrderById(int orderId) {
        //return orders.get(orderId);

        for (Order order : orders) {
            if (order.id() == orderId) {
                return order;
            }
        }
        System.out.println("Order with ID " + orderId + " not found!");
        return null;
    }

    @Override
    public List<Order> getAllOrders() {
        return new ArrayList<>(orders);
    }

    @Override
    public void printAllOrders() {
        List<Order> allOrders = getAllOrders();

        if (allOrders.isEmpty()) {
            System.out.println("No orders available.");
        } else {
            System.out.println("All Orders:");
            for (Order order : allOrders) {
                System.out.println(order);
            }
        }
    }
}
