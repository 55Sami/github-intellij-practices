import java.util.Scanner;

public class QuitGame {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int choice;

            System.out.println("1.Play Game");
            System.out.println("2.View Options");
            System.out.println("3.Quit");

            do{
                System.out.print("Select an option: ");
                choice = scanner.nextInt();

                if(choice != 3){
                    System.out.println("Keep playing");
                }
            }
            while(choice != 3);

            System.out.println("Goodbye!");
            scanner.close();
    }

}
