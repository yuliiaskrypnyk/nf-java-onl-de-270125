package org.example.ProductRepo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ShopService {
    private final ProductRepo productRepo;
    private final OrderListRepo orderListRepo;

    public ShopService(ProductRepo productRepo, OrderListRepo orderListRepo) {
        this.productRepo = productRepo;
        this.orderListRepo = orderListRepo;
    }

    public void placeOrder(int customerId, List<Integer> productIds) {
        List<Product> orderProducts = new ArrayList<>();
        double totalPrice = 0.0;

        for (Integer productId : productIds) {
            Product product = productRepo.getProductById(productId);
            if (product == null) {
                System.out.println("Product with ID " + productId + " does not exist!");
                return;
            }
            orderProducts.add(product);
            totalPrice += product.price();
        }

        Order newOrder = new Order(orderListRepo.getAllOrders().size() + 1, customerId, orderProducts, totalPrice, LocalDateTime.now(), "Pending");
        orderListRepo.addOrder(newOrder);
        System.out.println("Order placed successfully: " + newOrder);
    }
}
