package org.example.ProductRepo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ShopService {
    private final ProductRepo productRepo;
    //    private final OrderListRepo orderListRepo;
    private final OrderRepo orderRepo;
    private final CLI cli;

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
        this.cli = new CLI();
    }

    public void placeOrder(int customerId, List<Integer> productIds) {
        List<Product> orderProducts = new ArrayList<>();

        for (Integer productId : productIds) {
            Product product = productRepo.getProductById(productId);
            if (product == null) {
                cli.printError("Product with ID " + productId + " does not exist!");
                return;
            }
            orderProducts.add(product);
        }

        int newOrderId = orderRepo.getAllOrders().size() + 1;
        //Order newOrder = new Order(orderRepo.getAllOrders().size() + 1, customerId, orderProducts, totalPrice, LocalDateTime.now(), "Pending");

        BigDecimal totalPrice = new Order(newOrderId, customerId, orderProducts, BigDecimal.ZERO, LocalDateTime.now(), "Pending").calculateTotalPrice();

        Order newOrder = new Order(newOrderId, customerId, orderProducts, totalPrice, LocalDateTime.now(), "Pending");

        orderRepo.addOrder(newOrder);
        cli.printSuccess("Order placed successfully:");
        System.out.println(newOrder);
    }
}
