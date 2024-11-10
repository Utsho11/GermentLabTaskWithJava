package group2.germentlabtaskwithjava;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Garment {
    public String id;
    public String name;
    public String description;
    public String size;
    public String color;
    public double price;
    public int stockQuantity;

    public void updateStock(int quantity) {
        stockQuantity += quantity;
    }

    public double calculateDiscountPrice(double discountPercentage) {
        double discountAmount = price * (discountPercentage / 100);
        return price - discountAmount;
    }
}

class Fabric {
    public String id;
    public String type;
    public String color;
    public double pricePerMeter;

    public double calculateCost(double meters) {
        return pricePerMeter * meters;
    }

}

class Supplier {
    public String id;
    public String name;
    public String contactInfo;
    private List<Fabric> suppliedFabrics = new ArrayList<Fabric>();

    public void addFabric(Fabric fabric) {
        suppliedFabrics.add(fabric);
    }

    public List<Fabric> getSuppliedFabrics() {
        return suppliedFabrics;
    }
}

class Order {
    public String orderId;
    public Date orderDate;
    public double totalAmount;
    public List<Garment> garments = new ArrayList<Garment>();

    public void addGarment(Garment garment) {
        garments.add(garment);
    }

    public double calculateTotalAmount() {
        for (Garment garment : garments) {
            totalAmount += garment.price;
        }
        return totalAmount;
    }

    public void printOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Garments:");
        for (Garment garment : garments) {
            System.out.println("- " + garment.name + ": " + garment.price);
        }
    }
}

class Customer {
    public String customerId;
    public String name;
    public String email;
    public String phone;
    List<Order> orders = new ArrayList<Order>();

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println("Order placed successfully!");
        System.out.println("Order ID: " + order.orderId);
    }

    public void viewOrders() {
        System.out.println("Orders placed by customer " + name + ":");
        if (orders.isEmpty()) {
            System.out.println("No orders found.");
        } else {
            for (Order order : orders) {
                order.printOrderDetails();
                System.out.println();
            }
        }
    }

}

public class GermentLabTaskWithJava {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
