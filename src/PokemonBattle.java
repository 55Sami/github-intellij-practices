import java.util.Scanner;
import java.util.Random;

public class PokemonBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] elements = {"fire", "water", "grass"};
        String computerPick;
        String playerPick;
        String playAgain= "yes";

        do{
            System.out.print("Enter your Choice(fire, water, grass): ");
            playerPick = scanner.nextLine().toLowerCase();

            if(!playerPick.equals("fire") &&
                    !playerPick.equals("water") &&
                    !playerPick.equals("grass")){
                System.out.println("Invalid Choice");
                continue;
            }

            computerPick = elements[random.nextInt(3)];
            System.out.println("Computer Pick: "+computerPick);

            if(playerPick.equals(computerPick)){
                System.out.println("Its a Tie!");
            }else if((playerPick.equals("fire") && computerPick.equals("grass")) ||
                    (playerPick.equals("water") && computerPick.equals("fire")) ||
                    (playerPick.equals("grass") && computerPick.equals("water"))){
                System.out.println("You Win!");
            }else{
                System.out.println("You lose!");
            }
            System.out.print("Play again(yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        }
        while(playAgain.equals("yes"));

        System.out.println("Thanks for playing!");

        scanner.close();

    }
}
