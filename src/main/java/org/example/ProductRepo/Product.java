package org.example.ProductRepo;

public record Product(int id, String name, double price) {
    @Override
    public String toString() {
        return String.format("{id=%d, name='%s', price=%.2f}", id, name, price);
    }
}
