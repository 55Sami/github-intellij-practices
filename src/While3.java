import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age =0;

        do{
            System.out.println("Your age cannot be negative");
            System.out.print("Enter Your age: ");
            age = scanner.nextInt();
        }while(age<0);

        System.out.println("You are "+age+" years old");
        scanner.close();

    }
}
