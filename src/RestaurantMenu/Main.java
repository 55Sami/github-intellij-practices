package RestaurantMenu;

public class Main {
    public static void main(String[] args) {

        Burger burger = new Burger();
        Fries fries = new Fries();

        burger.prepareFood();
        burger.printReceipt();
        fries.prepareFood();
        burger.setPrice(400);

        System.out.println("Burger price: $"+burger.getPrice());
    }
}
