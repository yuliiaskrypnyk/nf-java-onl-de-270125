package org.example.ProductRepo;

import java.math.BigDecimal;

public record Product(int id, String name, BigDecimal price) {
    @Override
    public String toString() {
        return String.format("{id=%d, name='%s', price=%.2f}", id, name, price);
    }
}
