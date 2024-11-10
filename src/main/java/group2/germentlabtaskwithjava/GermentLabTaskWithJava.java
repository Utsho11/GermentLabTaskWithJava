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

}

public class GermentLabTaskWithJava {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
