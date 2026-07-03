import java.util.Scanner;

public class AtmPinLOck{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pin;
        int correctPin =1234;

        do{
            System.out.print("Enter your ATM PIN: ");
            pin = scanner.nextInt();
            if(pin != correctPin) {
                System.out.println("The PIN does not match");
            }
        }
        while(pin !=correctPin);

        System.out.println("Access Granted");

        scanner.close();

    }
}


