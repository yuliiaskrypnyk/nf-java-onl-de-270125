package org.example.ProductRepo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderMapRepo implements OrderRepo {
    private final Map<Integer, Order> ordersMap;
    private final CLI cli;

    public OrderMapRepo() {
        this.ordersMap = new HashMap<>();
        this.cli = new CLI();
    }

    @Override
    public void addOrder(Order order) {
        ordersMap.put(order.id(), order);
        cli.printSuccess("Order with ID " + order.id() + " added.");
    }

    @Override
    public void removeOrder(int orderId) {
        if (ordersMap.containsKey(orderId)) {
            ordersMap.remove(orderId);
            cli.printSuccess("Order with ID " + orderId + " removed.");
        } else {
            cli.printError("Order with ID " + orderId + " does not exist.");
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
            cli.printInfo("No orders available.");
        } else {
            cli.printInfo("All Orders:");
            for (Order order : ordersMap.values()) {
                System.out.println(order);
            }
        }
    }
}
