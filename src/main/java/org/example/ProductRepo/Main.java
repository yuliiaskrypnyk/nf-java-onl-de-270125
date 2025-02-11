package org.example.ProductRepo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductRepo productRepo = new ProductRepo();
        productRepo.addProduct(new Product(1, "Laptop", 2000));
        productRepo.addProduct(new Product(2, "Phone", 1000));
        productRepo.addProduct(new Product(3, "Mouse", 100));

/*        OrderListRepo orderListRepo = new OrderListRepo();

        ShopService shopService = new ShopService(productRepo, orderListRepo);

        List<Integer> order1 = List.of(1, 3);
        shopService.placeOrder(1, order1);

        List<Integer> order2 = List.of(2);
        shopService.placeOrder(2, order2);

        productRepo.removeProduct(2);

        List<Integer> order3 = List.of(2);
        shopService.placeOrder(3, order3);

        orderListRepo.removeOrder(1);

        orderListRepo.printAllOrders();

        orderListRepo.getOrderById(2);
        orderListRepo.getOrderById(0);*/

        OrderRepo orderRepo = new OrderMapRepo();
        ShopService shopService = new ShopService(productRepo, orderRepo);

        List<Integer> order1 = List.of(1, 3);
        shopService.placeOrder(1, order1);

        List<Integer> order2 = List.of(2);
        shopService.placeOrder(2, order2);

        productRepo.removeProduct(2);

        List<Integer> order3 = List.of(2);
        shopService.placeOrder(3, order3);

        orderRepo.removeOrder(1);

        orderRepo.printAllOrders();
    }
}
