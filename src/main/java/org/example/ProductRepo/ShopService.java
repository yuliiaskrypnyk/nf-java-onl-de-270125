package org.example.ProductRepo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ShopService {
    private final ProductRepo productRepo;
//    private final OrderListRepo orderListRepo;
    private final OrderRepo orderRepo;

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
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

        Order newOrder = new Order(orderRepo.getAllOrders().size() + 1, customerId, orderProducts, totalPrice, LocalDateTime.now(), "Pending");
        orderRepo.addOrder(newOrder);
        System.out.println("Order placed successfully: " + newOrder);
    }
}
