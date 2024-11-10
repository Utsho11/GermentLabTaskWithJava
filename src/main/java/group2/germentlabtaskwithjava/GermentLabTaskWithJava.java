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

    public Garment(String id, String name, String description, String size, String color, double price,
            int stockQuantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.size = size;
        this.color = color;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

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

    public Fabric(String id, String type, String color, double pricePerMeter) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.pricePerMeter = pricePerMeter;
    }

    public double calculateCost(double meters) {
        return pricePerMeter * meters;
    }

}

class Supplier {
    public String id;
    public String name;
    public String contactInfo;
    private List<Fabric> suppliedFabrics = new ArrayList<Fabric>();

    public Supplier(String id, String name, String contactInfo) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
        this.suppliedFabrics = new ArrayList<>();
    }

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
        totalAmount = 0;
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

class Inventory {
    public List<Garment> garments = new ArrayList<Garment>();

    public void addGarment(Garment garment) {
        garments.add(garment);
    }

    public void removeGarment(String id) {
        for (Garment garment : garments) {
            if (garment.id.equals(id)) {
                garments.remove(garment);
                System.out.println("Garment removed successfully!");
                return;
            }
        }
        System.out.println("Garment not found.");
    }

    public Garment findGarment(String id) {
        for (Garment garment : garments) {
            if (garment.id.equals(id)) {
                return garment;
            }
        }
        return null;
    }

}

public class GermentLabTaskWithJava {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
