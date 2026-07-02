import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing the game");
            System.out.print("Press Q to exit: ");
            response = scanner.nextLine().toUpperCase();
        }
        System.out.println("You have quit the game");

        scanner.close();

    }
}
