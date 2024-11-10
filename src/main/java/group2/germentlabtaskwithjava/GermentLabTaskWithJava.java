package group2.germentlabtaskwithjava;

import java.util.ArrayList;
import java.util.List;

class Garment {
    String id;
    String name;
    String description;
    String size;
    String color;
    double price;
    int stockQuantity;

    void updateStock(int quantity) {
        stockQuantity += quantity;
    }

    double calculateDiscountPrice(double discountPercentage) {
        double discountAmount = price * (discountPercentage / 100);
        return price - discountAmount;
    }
}

class Fabric {
    String id;
    String type;
    String color;
    double pricePerMeter;

    double calculateCost(double meters) {
        return pricePerMeter * meters;
    }

}

class Supplier {
    String id;
    String name;
    String contactInfo;
    private List<Fabric> suppliedFabrics = new ArrayList<Fabric>();

    void addFabric(Fabric fabric) {
        suppliedFabrics.add(fabric);
    }

}

public class GermentLabTaskWithJava {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
