package org.example.ProductRepo;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Product> products = new HashMap<>();
        products.put(1, new Product(1, "Laptop", 2000));
        products.put(2, new Product(2, "Phone", 1000));

        ProductRepo productRepo = new ProductRepo(products);

        System.out.println(productRepo.getProducts());
        System.out.println(productRepo.getProductById(1));

        productRepo.addProduct(new Product(3, "Mouse", 100));

        System.out.println(productRepo.getProducts());
        System.out.println(productRepo.getProductById(3));

        productRepo.removeProduct(3);

        System.out.println(productRepo.getProducts());
        System.out.println(productRepo.getProductById(3));
    }
}
