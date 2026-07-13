import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String secretWord ="Banana";
        String guess = "";

        do{
            System.out.print("Guess the secret word: ");
            guess = scanner.nextLine();

            if(!guess.equals(secretWord)){
                System.out.println("Wrong guess! Try again.");
            }
        }
        while(!guess.equals(secretWord));

        System.out.println("You win!!");
        scanner.close();
    }
}
