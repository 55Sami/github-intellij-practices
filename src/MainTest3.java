class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class MainTest3 {
    public static void main(String[] args) {
        Product item = new Product("Plastic Bag",45);
        System.out.println(item.name);
    }
}
