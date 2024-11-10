package group2.germentlabtaskwithjava;

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

public class GermentLabTaskWithJava {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
