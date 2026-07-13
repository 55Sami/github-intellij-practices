import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts=0;
        int randomNumber =random.nextInt(1,101);

        System.out.println("+++++Number Guessing Game+++++");
        System.out.println("Guess a number 1 to 100.");


        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess<randomNumber){
                System.out.println("TOO LOW!! Try Again.");
            }else if(guess > randomNumber){
                System.out.println("TOO HIGH! Try Again!");
            }else{
                System.out.println("CORRECT!!! The number was "+randomNumber);
                System.out.println("The number of attempts you took: "+attempts);
            }

        }
        while(guess != randomNumber);


        scanner.close();

    }
}
