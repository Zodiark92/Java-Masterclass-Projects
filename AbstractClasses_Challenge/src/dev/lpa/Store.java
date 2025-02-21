package dev.lpa;

import java.util.ArrayList;

public class Store {

    private static ArrayList<ProductForSale> products;
    private static double totalPrice;
    private static ArrayList<OrderItem> order;

    public static void main(String[] args) {

        products = new ArrayList<>();
        order = new ArrayList<>();

        products.add(new Monitor("Monitor", 267.31));
        products.add(new Case("PC Case", 297.56));
        products.add(new Notebook("Lenovo Notebook", 3382.16));

        printListItems();

        order.clear();
        totalPrice = 0.0;

        addOrderItem("Monitor", 1);
        addOrderItem("PC Case", 1);

        printOrder();

        System.out.println("-".repeat(30));

        order.clear();
        totalPrice = 0.0;

        addOrderItem("Lenovo Notebook", 2);
        addOrderItem("Monitor", 2);

        printOrder();

    }

    private static void printListItems() {
        for(ProductForSale product : products) {
            product.showDetails();
        }
    }

    private static void addOrderItem(ProductForSale product, int quantity) {
            order.add(new OrderItem(quantity, product));
            totalPrice += product.getSalesPrice(quantity);
            System.out.printf("Item %s added in the list, price: %.2f, quantity: %d%n", product.getType(), product.getPrice(), quantity);
    }

    private static void addOrderItem(String name, int quantity) {
        ProductForSale productOrdered = getItem(name);
        if(productOrdered != null) {
            addOrderItem(productOrdered, quantity);
            return;
        }
        System.out.println("Item " + name + " not found in the store");
    }

    private static ProductForSale getItem(String name) {
        for(ProductForSale product : products) {
            if(product.getType().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    private static void printOrder() {

        if(order.isEmpty()){
            System.out.println("No items in the order");
            return;
        }

        System.out.println("*".repeat(20));

        for(OrderItem item : order) {
            item.getProduct().printPricedItem(item.getQuantity());
        }
        System.out.println("*".repeat(20));
        System.out.println("Total price of the order: " + totalPrice + " dollars");
    }

}
