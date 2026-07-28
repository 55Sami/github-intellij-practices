import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computersChoice;
        String playAgain = "yes";
        do{
            System.out.print("Enter your move(rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")) {

                System.out.println("Invalid Choice!");
                continue;
            }

            computersChoice = choices[random.nextInt(3)];
            System.out.println("Computer Choice: "+ computersChoice);

            if(playerChoice.equals(computersChoice)){
                System.out.println("It's a Tie!");
            }else if((playerChoice.equals("rock") && computersChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computersChoice.equals("rock")) ||
                    playerChoice.equals("scissors") && computersChoice.equals("paper")){
                System.out.println("You Win!");
            }else{
                System.out.println("You Lose");
            }
            System.out.print("Play again(yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        }while(playAgain.equals("yes"));

        System.out.println("Thanks for playing!");

        scanner.close();
    }
}
