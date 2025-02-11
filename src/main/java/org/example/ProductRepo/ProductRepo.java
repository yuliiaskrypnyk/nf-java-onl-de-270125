package org.example.ProductRepo;

import java.util.HashMap;
import java.util.Map;

public class ProductRepo {
    private final Map<Integer, Product> productMap;

    public ProductRepo() {
        this.productMap = new HashMap<>();
    }

    public void addProduct(Product product) {
        productMap.put(product.id(), product);
    }

    public void removeProduct(int productId) {
        productMap.remove(productId);
    }

    public Product getProductById(int productId) {
        return productMap.get(productId);
    }

    public Map<Integer, Product> getProducts() {
        return new HashMap<>(productMap);
    }
}
