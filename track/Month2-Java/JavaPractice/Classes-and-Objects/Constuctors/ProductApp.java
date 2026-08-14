
import java.util.Scanner;

class Product {

    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
    }
}

class ProductApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String productName = sc.nextLine();
        double price = sc.nextDouble();
        Product p1 = new Product(productName, price);
        p1.display();
    }
}
