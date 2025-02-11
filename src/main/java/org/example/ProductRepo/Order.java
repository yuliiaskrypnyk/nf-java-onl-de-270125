package org.example.ProductRepo;

import java.time.LocalDateTime;
import java.util.List;

public record Order(int id,
                    int customerId,
                    List<Product> products,
                    double totalPrice,
                    LocalDateTime orderDate,
                    String status) {

    @Override
    public String toString() {
        return String.format(
                "Order ID: %d, Customer ID: %d, Products: %s, Total Price: %.2f, Date: %s, Status: %s",
                id, customerId, products, totalPrice, orderDate, status
        );
    }
}
