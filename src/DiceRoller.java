import java.util.Random;

public class DiceRoller {

    // GLOBAL VARIABLES: Put these outside the methods so both main and rollDice can see them!
    static Random random = new Random();
    static int number;

    public static void rollDice() {
        // Use the global random tool to pick a number between 1 and 6
        number = random.nextInt(6) + 1;
        System.out.println("You rolled a: " + number);
    }

    public static void main(String[] args) {
        // Just call your method to roll the dice!
        rollDice();
    }
}
