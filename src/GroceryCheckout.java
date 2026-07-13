import java.util.Scanner;

public class GroceryCheckout {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double totalBill = 0;
        double itemPrice = -1;
        System.out.print("Enter the price of an item: ");
        itemPrice = scanner.nextDouble();

        while(itemPrice!=0){
            totalBill+=itemPrice;

            System.out.print("Enter the price of an item: ");
            itemPrice = scanner.nextDouble();
        }

        System.out.println("Your total bill is: "+totalBill);
        scanner.close();
    }
}
