package org.example.ProductRepo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.List;

public record Order(int id,
                    int customerId,
                    List<Product> products,
                    BigDecimal totalPrice,
                    LocalDateTime orderDate,
                    String status) {

    public BigDecimal calculateTotalPrice() {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (Product product : products) {
            totalPrice = totalPrice.add(product.price());
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return String.format(
                "Order ID: %d, Customer ID: %d, Products: %s, Total Price: %.2f, Date: %s, Status: %s",
                id, customerId, products, totalPrice.setScale(2, RoundingMode.HALF_UP), orderDate, status
        );
    }
}
