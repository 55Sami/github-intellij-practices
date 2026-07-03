import java.util.Scanner;

public class BudgetWarning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 50;
        double expense;

        do{
            System.out.print("Enter expense amount: ");
            expense = scanner.nextDouble();
            balance-=expense;
            System.out.println("Your remainig balance is "+balance);

        }while(balance >0);
        System.out.println("You are out of money. Game Over");

        scanner.close();
    }
}
